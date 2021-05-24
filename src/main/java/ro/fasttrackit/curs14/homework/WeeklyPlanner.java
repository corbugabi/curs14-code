package ro.fasttrackit.curs14.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WeeklyPlanner {
    private final List<DaySchedule> daySchedules = new ArrayList<>();

    public void addActivity(Day day, String activity) {
        if (activity == null) {
            throw new NoActivityException("Activity is null");
        }
        var foundSchedule = getDaySchedule(day);
        if (foundSchedule == null) {
            foundSchedule = new DaySchedule(day);
            daySchedules.add(foundSchedule);
        }
        foundSchedule.addActivity(activity);
    }

    public DaySchedule getDaySchedule(Day day) {
        for (DaySchedule schedule : daySchedules) {
            if (schedule.getDay() == day) {
                return schedule;
            }
        }
        return null;
    }

    public void removeActivity(Day day, String activity) {
        var foundSchedule = getDaySchedule(day);
        if (foundSchedule == null || !foundSchedule.containsActivity(activity)) {
            throw new NoActivityException("No exist");
        } else {
            foundSchedule.removeActivity(activity);
        }
    }

    public List<String> getActivities(Day day) {
        var foundSchedule = getDaySchedule(day);
        if (foundSchedule != null) {
            return foundSchedule.getActivities();
        } else {
            return List.of();
        }
    }

    public Map<Day, List<String>> endPlanning() throws NoActivityForDayException{
        Map<Day, List<String>> result = new HashMap<>();
        for (Day day : Day.values()) {
            DaySchedule schedule = getDaySchedule(day);
            if (schedule == null || schedule.getActivities().isEmpty()){
                throw new NoActivityForDayException("No activities for " + day);
            }
            result.put(schedule.getDay(),schedule.getActivities());

        }
        return result;
    }
}
