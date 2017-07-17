package kr.anima.xd.s.pawpaw;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.util.Random;

/**
 * Created by alfo6-10 on 7/17/2017.
 */

public class NumImg {

    Bitmap[] nums=new Bitmap[10];
    int x, y;
    int rad;

    Random rnd=new Random();

    public NumImg() {

        rad=rnd.nextInt(61)+20; // 20~80

    }
}
