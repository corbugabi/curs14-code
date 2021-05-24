package ro.fasttrackit.curs14.homework;

import java.io.OutputStream;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DaySchedule mySchedule = new DaySchedule(Day.MONDAY);
        List<String> act = mySchedule.getActivities();
        System.out.println();
        act.add("Hackermann");
        System.out.println(mySchedule.getActivities());
        System.out.println(act);
        mySchedule.addActivity("Run");
        System.out.println(mySchedule.getActivities());

        WeeklyPlanner planner = new WeeklyPlanner();
        planner.addActivity(Day.THURSDAY, "Course");
        planner.addActivity(Day.THURSDAY,"Food");
        System.out.println(planner.getDaySchedule(Day.THURSDAY));

        planner.removeActivity(Day.THURSDAY, "Course");
        System.out.println(planner.getDaySchedule(Day.THURSDAY));
     //   planner.removeActivity(Day.THURSDAY, "Run");
        System.out.println(planner.getDaySchedule(Day.THURSDAY));

        try {
            System.out.println(planner.endPlanning());
        }catch (NoActivityForDayException err){
            System.out.println(err.getMessage());
        }
    }
}
