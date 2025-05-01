package org.example;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private int id;
    private String password;
    private String name;
    private AccountStatus status;
    private Location address;
    private String email;
    private String phone;
    private List<WatchList> watchLists;

    public Account(int id, String name, String password, String email, String phone, Location address) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.status = AccountStatus.ACTIVE;
        this.watchLists = new ArrayList<>();
    }

    public boolean resetPassword(String newPassword) {
        if (newPassword == null || newPassword.isEmpty()) return false;
        this.password = newPassword;
        return true;
    }

    public boolean createWatchList(WatchList watchList) {
        if (watchList == null) return false;
        return watchLists.add(watchList);
    }

    public boolean deleteWatchList(String name) {
        return watchLists.removeIf(w -> w.getName().equalsIgnoreCase(name));
    }

    // Getters
    public List<WatchList> getWatchLists() {
        return watchLists;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public Location getAddress() {
        return address;
    }
}

