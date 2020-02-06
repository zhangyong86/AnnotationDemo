package com.example.annotationtest;

import androidx.annotation.IntDef;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class MainActivity extends AppCompatActivity {

    public static final int SUNDAY = 0;
    public static final int MONDAY = 1;
    public static final int TUESDAY = 2;
    public static final int WEDNESDAY = 3;
    public static final int THURSDAY = 4;
    public static final int FRIDAY = 5;
    public static final int SATURDAY = 6;

    //自定义注解
    @IntDef({SUNDAY, MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY})
    @Retention(RetentionPolicy.SOURCE)
    public @interface WeekDays {}

    @WeekDays int currentDay = SUNDAY;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setCurrentDay(WEDNESDAY);
        getResources().getString(R.string.app_name);
//        setCurrentDay(1);编译错误;必须是WeekDays类型的

        @WeekDays int today = getCurrentDay();

        switch (today){
            case SUNDAY:
                break;
            case MONDAY:
                break;
            case TUESDAY:
                break;
            case WEDNESDAY:
                break;
            case THURSDAY:
                break;
            case FRIDAY:
                break;
            case SATURDAY:
                break;
            default:
                break;
        }
    }

    public void setCurrentDay(@WeekDays int currentDay) {
        this.currentDay = currentDay;
    }

    @WeekDays
    public int getCurrentDay() {
        return currentDay;
    }

}
