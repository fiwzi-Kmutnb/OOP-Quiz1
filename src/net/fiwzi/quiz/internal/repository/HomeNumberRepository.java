package net.fiwzi.quiz.internal.repository;

import net.fiwzi.quiz.infrastructure.storages.HomeNumber;

public class HomeNumberRepository {
    HomeNumber homeNumber;
    public HomeNumberRepository(HomeNumber homeNumber) {
        this.homeNumber = homeNumber;
    }
    public HomeNumber find(int digit) {
        return homeNumber.data[digit];
    }

}
