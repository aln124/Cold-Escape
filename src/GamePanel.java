package main;
import entity.Entity;
import entity.Player;
import object.SuperObject;
import tile.TileManager;

import javax.swing.JPanel;
import java.awt.*;

public class GamePanel extends JPanel implements Runnable {

    //screen settings
    final int originalTileSize = 32;
    final int scale = 1;
    public final int  tileSize = originalTileSize * scale;
    public final int maxScreenCol = 18;
    public final int maxScreenRow = 16;
    public final int  screenWidth = tileSize * maxScreenCol;
    public final int  screenHeight = tileSize * maxScreenRow;

    //world settings
    public final int maxWorldCol =120;
    public final int maxWorldRow =20;
    public final int worldWidth=tileSize*maxWorldCol;
    public final int worldHeight=tileSize* maxWorldRow;


    //GAME STATE
    public int gameState;
    public final int titleState = 0;
    public final int playState = 1;
    public final int pauseState = 2;
    public final int deadState = 3 ;
    //

    //FPS
    int FPS = 60;

    TileManager tileM = new TileManager(this);
    public UI ui = new UI(this);
    public main.KeyHandler keyH;
    Thread gameThread;
    public ColisionCheck check=new ColisionCheck(this);
    public Player player = new Player(this, keyH);
    public SuperObject obj[] = new SuperObject[30];
    public AssetSetter assetSetter = new AssetSetter(this);
    public Entity npc[] = new Entity[10];
    public double playTime=0;
    public EventHandler eHandler = new EventHandler(this);
    Sound sound = new Sound();

    public GamePanel(){
        keyH = new main.KeyHandler(this);
        player = new Player(this, keyH);
        UI ui;
        this.setPreferredSize(new Dimension(screenWidth,screenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
        this.addKeyListener(keyH);
        this.setFocusable(true);
    }

    public void setupGame(){
        //gameState = playState;
        assetSetter.setObject();
        assetSetter.setNPC();

    }
    public void startGameThread(){
        gameThread = new Thread(this);
        gameThread.start();
    }
    @Override
    public void run() {
        double drawInterval = 1000000000/FPS;
        double nextdrawTime = System.nanoTime() + drawInterval;
        while(gameThread != null)
        {

//            System.out.println("merge");
            update();
            repaint();

            try{
                double remainingTime = nextdrawTime - System.nanoTime();
                remainingTime = remainingTime / 1000000;

                if(remainingTime < 0){
                    remainingTime = 0;
                }
             Thread.sleep((long)remainingTime);
                nextdrawTime += drawInterval;
        }catch(InterruptedException e){
            e.printStackTrace();}
        }
    }

    public void update()
    {
        if(gameState == playState) {
            //timer
            playTime += 1.0 / 60.0;
            //PLAYER
            player.update();
            //NPC
            for (int i=0; i < npc.length; i++)
            {
                if(npc[i] != null)
                {
                    npc[i].update();
                }
            }
        }
        if(gameState == pauseState)
        {

        }
    }


    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        if(gameState == titleState){
            ui.draw(g2);
        }
        else if (gameState==pauseState)
        {
           ui.draw(g2);
        }
        else if (gameState==deadState)
        {
            ui.draw(g2);
        }
        else {
            //TILE
            tileM.draw(g2);

            //OBJECT
            for(int i = 0; i< obj.length;i++)
                if(obj[i] != null)
                {
                    obj[i].draw(g2,this);
                }
            //NPC
            for(int i=0; i < npc.length; i++)
                if(npc[i] != null)
                {
                    npc[i].draw(g2);
                }
            //PLAYER
            player.draw(g2);
            //UI
            ui.draw(g2);
        }
        g2.dispose();

    }

    public void playMusic(int i){
        sound.setFile(i);
        sound.play();
        sound.loop();
    }
    public void stopMusic(){
        sound.stop();
    }

    public void playSE(int i){
        sound.setFile(i);
        sound.play();
    }



}
