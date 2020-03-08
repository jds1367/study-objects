package com.johngrib.objects._04_movie_data_system;

import lombok.Getter;
import lombok.Setter;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class DiscountCondition {
  @Getter
  @Setter
  private DiscountConditionType type;
  @Getter
  @Setter
  private int sequence;
  @Getter
  @Setter
  private DayOfWeek dayOfWeek;
  @Getter
  @Setter
  private LocalTime startTime;
  @Getter
  @Setter
  private LocalTime endTime;
}