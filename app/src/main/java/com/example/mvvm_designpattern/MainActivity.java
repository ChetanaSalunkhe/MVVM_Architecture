package com.example.mvvm_designpattern;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.BindingAdapter;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.mvvm_designpattern.databinding.ActivityMainBinding;
/*test*/
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        // ViewModel updates the Model
        // after observing changes in the View
        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        // model will also update the view
        // via the ViewModel
        activityMainBinding.setViewModel(new AppViewModel());
        activityMainBinding.executePendingBindings();

    }

    @BindingAdapter({"toastmessage"})
    public static void runMe(View view, String message){
        if(message != null){
            Toast.makeText(view.getContext(),message,Toast.LENGTH_SHORT).show();
        }
    }
}
