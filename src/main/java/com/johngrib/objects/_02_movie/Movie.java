package com.johngrib.objects._02_movie;

import lombok.Getter;

import java.time.Duration;

/** 영화. */
public class Movie {
  private String title;
  private Duration runningTime;
  /** 기본 요금. */
  @Getter
  private Money fee;
  /** 할인 정책. */
  private DiscountPolicy discountPolicy;

  public Movie(String title, Duration runningTime, Money fee, DiscountPolicy discountPolicy) {
    this.title = title;
    this.runningTime = runningTime;
    this.fee = fee;
    this.discountPolicy = discountPolicy;
  }

  /**
   * 할인된 금액을 계산해 리턴한다.
   *
   * @param screening 상영 정보
   * @return 할인된 금액
   */
  public Money calculateMovieFee(Screening screening) {
    if (discountPolicy == null) {
      return fee;
    }
    return fee.minus(discountPolicy.calculateDiscountAmount(screening));
  }

  /**
   * 실행 시점에 할인 정책을 변경한다.
   *
   * @param discountPolicy 변경할 할인 정책.
   */
  public void changeDiscountPolicy(DiscountPolicy discountPolicy) {
    this.discountPolicy = discountPolicy;
  }
}
