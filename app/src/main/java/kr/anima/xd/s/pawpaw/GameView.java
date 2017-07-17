package kr.anima.xd.s.pawpaw;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.SurfaceView;
import android.view.SurfaceHolder;

import java.util.ArrayList;

/**
 * Created by alfo6-10 on 7/17/2017.
 */

public class GameView extends SurfaceView implements SurfaceHolder.Callback {

    SurfaceHolder holder;
    Context context;
    int width, height;
    GameThread gThread;

    public GameView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context=context;
        holder=getHolder();
        holder.addCallback(this);
    }

    @Override
    public void surfaceCreated(SurfaceHolder holder) {

    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {
        this.width=width;
        this.height=height;
        if(gThread==null){
            gThread=new GameThread();
            gThread.start();
        }
    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {

    }

    class GameThread extends Thread{

        Bitmap[] imgNums=new Bitmap[10];
        ArrayList<NumImg> numbers=new ArrayList<>();
        int x, y, w, h;

        Bitmap imgPaws;
        Bitmap imgBack;

        public GameThread() {

            for(int i=0; i<10; i++){
                imgNums[i]= BitmapFactory.decodeResource(context.getResources(), R.drawable.number0+i);
            }

        }

        @Override
        public void run() {
            Canvas canvas=null;

            while (true){
                canvas=holder.lockCanvas();

                try { // onDraw
                    synchronized (holder){

                    }
                }finally {
                    if(canvas!=null){
                        holder.unlockCanvasAndPost(canvas);
                    }
                } // finally

            } // while

        } // run
    }// GameThread

} // GameView
