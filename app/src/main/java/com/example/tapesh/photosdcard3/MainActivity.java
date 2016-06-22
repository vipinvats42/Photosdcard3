package com.example.tapesh.photosdcard3;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Environment;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.File;
import java.lang.reflect.Field;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button;
    ImageView imageView;

    //   String imgpath= Environment.getExternalStorageDirectory().toString()+"/image1.png";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        imageView = (ImageView) findViewById(R.id.imageView);
        button.setOnClickListener(this);

    }


    public void onClick(View view) {

//    Toast.makeText(getApplicationContext(),imgpath,Toast.LENGTH_LONG).show();
//        Bitmap bitmap= BitmapFactory.decodeFile(imgpath);
        // imageView.setImageBitmap(bitmap);
//        String filename="valuess";
//        Context context=null;
//        File[] exter= ContextCompat.getExternalFilesDirs(context,filename);
//        if(exter[0].exists())
//        {
//            Toast.makeText(this,"file exists",Toast.LENGTH_LONG).show();
//        }else
//        {
//            Toast.makeText(this,"file not exists",Toast.LENGTH_LONG).show();
//        }

        sdCardDir(this);
    }


    private  File sdCardDir(Context context) {
//        File[] externalFilesDir = ContextCompat.getExternalFilesDirs(context, "valuess");
//        File emulatedStorageDir = Environment.isExternalStorageEmulated() ? context.getExternalFilesDir(null) : null;
//
//        File workingDir = null;
//        for (File dir : externalFilesDir)
//            if (dir != null && (emulatedStorageDir == null || !dir.equals(emulatedStorageDir))) {
//                workingDir = dir;
//                break;
//            }
//        Log.d("CollectMobile", "Working dir - sdCardDir: " + workingDir);
//        return workingDir;

        String fileName = "valuess";

        File[] extDBPath = ContextCompat.getExternalFilesDirs(context, null);
        if (extDBPath[0] != null) {
            if (extDBPath[0].exists()) {
                //    extDBPath[0].mkdirs();
              Log.i("exists","folder");
              Log.i("extDBPath[0]", extDBPath[0].toString());

               String image="image1.jpg";
             File file=new File(extDBPath[0].getPath().toString(),"image1.jpg");
                Log.i("file",file.toString());
                if(file.exists())
                {
                    Log.i("exists","file");
                }else
                {
                    Log.i("exists"," not file");
                }
//                File sdCardRoot = Environment.getExternalStorageDirectory().getAbsoluteFile();
//                File yourDir = new File(sdCardRoot, "storage/emulated/0/Android/data/com.example.tapesh.photosdcard3/files/valuess");
//                File file1=new File(yourDir,"image1.jpg");

//                if(yourDir.exists())
//                {
//                   Log.i("file exists","yes");
//                }else
//                {
//                    Log.i("file  not exists","no");
//                }





            }else
            {
                Log.i("not exists","folder");
            }



        }

        return new File(extDBPath[0], fileName);
    }
}