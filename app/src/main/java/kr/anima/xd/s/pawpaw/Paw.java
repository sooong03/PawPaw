package kr.anima.xd.s.pawpaw;

import android.graphics.Bitmap;

import java.util.Random;

/**
 * Created by alfo6-10 on 7/17/2017.
 */

public class Paw {

    Bitmap img;
    int x, y;
    int w, h;
    int rad;

    Random rnd=new Random();

    public Paw() {

        rad=rnd.nextInt(61)+20; // 20 ~ 80


    }
}
