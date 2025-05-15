package main;

import entity.OrcaNPC;
import object.ObjectChest;
import object.ObjectCoins;
import object.ObjectDoorLevel;
import object.ObjectKey;
import java.util.List;
import java.util.ArrayList;

public class AssetSetter {
    main.GamePanel gp;

    public AssetSetter(main.GamePanel gp)
    {
        this.gp = gp;
    }

    public void setNPC(){
        List<int[]> path1 = List.of(
                new int[] {21, 7},
                new int[] {4, 7},
                new int[] {4, 12},
                new int[] {14, 12},
                new int[] {14, 14},
                new int[] {21, 14},
                new int[] {21, 7}
        );

        List<int[]> path2 = List.of(
                new int[] {49, 3},
                new int[] {49, 14},
                new int[] {55, 14},
                new int[] {55, 13},
                new int[] {63, 13},
                new int[] {63, 3},
                new int[] {49, 3}
        );
        gp.npc[0] = new OrcaNPC(gp, path1);
        gp.npc[0].worldX= gp.tileSize * 21;
        gp.npc[0].worldY= gp.tileSize * 7;

        gp.npc[1] = new OrcaNPC(gp, path2);
        gp.npc[1].worldX= gp.tileSize * 49;
        gp.npc[1].worldY= gp.tileSize * 3;
    }

    public void setObject(){
        //level 1
        gp.obj[0] = new ObjectKey();
        gp.obj[0].worldX = gp.tileSize * 1;
        gp.obj[0].worldY = gp.tileSize * 1;

        gp.obj[1] = new ObjectKey();
        gp.obj[1].worldX = gp.tileSize * 30;
        gp.obj[1].worldY = gp.tileSize * 5;

        //level 2
        gp.obj[2] = new ObjectKey();
        gp.obj[2].worldX = gp.tileSize * 44;
        gp.obj[2].worldY = gp.tileSize * 5;

        gp.obj[3] = new ObjectKey();
        gp.obj[3].worldX = gp.tileSize * 78;
        gp.obj[3].worldY = gp.tileSize * 1;

        //level 3
        gp.obj[4] = new ObjectKey();
        gp.obj[4].worldX = gp.tileSize * 84;
        gp.obj[4].worldY = gp.tileSize * 1;

        gp.obj[5] = new ObjectKey();
        gp.obj[5].worldX = gp.tileSize * 89;
        gp.obj[5].worldY = gp.tileSize * 15;

        //level 1
        gp.obj[6] = new ObjectCoins();
        gp.obj[6].worldX = gp.tileSize * 1;
        gp.obj[6].worldY = gp.tileSize * 5;

        gp.obj[7] = new ObjectCoins();
        gp.obj[7].worldX = gp.tileSize * 9;
        gp.obj[7].worldY = gp.tileSize * 1;

        gp.obj[8] = new ObjectCoins();
        gp.obj[8].worldX = gp.tileSize * 9;
        gp.obj[8].worldY = gp.tileSize * 14;

        gp.obj[9] = new ObjectCoins();
        gp.obj[9].worldX = gp.tileSize * 33;
        gp.obj[9].worldY = gp.tileSize * 15;

        //level 2
        gp.obj[10] = new ObjectCoins();
        gp.obj[10].worldX = gp.tileSize * 50;
        gp.obj[10].worldY = gp.tileSize * 18;

        gp.obj[11] = new ObjectCoins();
        gp.obj[11].worldX = gp.tileSize * 78;
        gp.obj[11].worldY = gp.tileSize * 4;

        gp.obj[12] = new ObjectCoins();
        gp.obj[12].worldX = gp.tileSize * 78;
        gp.obj[12].worldY = gp.tileSize * 15;

        //level 3
        gp.obj[13] = new ObjectCoins();
        gp.obj[13].worldX = gp.tileSize * 80;
        gp.obj[13].worldY = gp.tileSize * 1;

        gp.obj[14] = new ObjectCoins();
        gp.obj[14].worldX = gp.tileSize * 81;
        gp.obj[14].worldY = gp.tileSize * 18;

        gp.obj[15] = new ObjectCoins();
        gp.obj[15].worldX = gp.tileSize * 82;
        gp.obj[15].worldY = gp.tileSize * 18;

        gp.obj[16] = new ObjectCoins();
        gp.obj[16].worldX = gp.tileSize * 104;
        gp.obj[16].worldY = gp.tileSize * 12;

        gp.obj[17] = new ObjectCoins();
        gp.obj[17].worldX = gp.tileSize * 90;
        gp.obj[17].worldY = gp.tileSize * 18;

        gp.obj[18] = new ObjectCoins();
        gp.obj[18].worldX = gp.tileSize * 118;
        gp.obj[18].worldY = gp.tileSize * 4;

        gp.obj[19] = new ObjectCoins();
        gp.obj[19].worldX = gp.tileSize * 118;
        gp.obj[19].worldY = gp.tileSize * 16;

        //level 1
        gp.obj[20] = new ObjectChest(gp);
        gp.obj[20].worldX = gp.tileSize * 3;
        gp.obj[20].worldY = gp.tileSize * 16;

        //level 2
        gp.obj[21] = new ObjectChest(gp);
        gp.obj[21].worldX = gp.tileSize * 74;
        gp.obj[21].worldY = gp.tileSize * 18;

        //level 3
        gp.obj[22] = new ObjectChest(gp);
        gp.obj[22].worldX = gp.tileSize * 80;
        gp.obj[22].worldY = gp.tileSize * 3;

        gp.obj[23] = new ObjectChest(gp);
        gp.obj[23].worldX = gp.tileSize * 115;
        gp.obj[23].worldY = gp.tileSize * 4;

        //usa level 1
        gp.obj[24] = new ObjectDoorLevel();
        gp.obj[24].worldX = gp.tileSize * 39;
        gp.obj[24].worldY = gp.tileSize * 10;

        //usa level 2
        gp.obj[25] = new ObjectDoorLevel();
        gp.obj[25].worldX = gp.tileSize * 79;
        gp.obj[25].worldY = gp.tileSize * 10;

        //usa level 2
        gp.obj[26] = new ObjectDoorLevel();
        gp.obj[26].worldX = gp.tileSize * 119;
        gp.obj[26].worldY = gp.tileSize * 9;
    }

}
