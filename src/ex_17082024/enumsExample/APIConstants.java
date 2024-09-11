package ex_17082024.enumsExample;

public enum APIConstants {

    LOGIN_PAGE("wwww.mypage/login"),
    HOME_PAGE("wwww.mypage/home_page"),
    DASHBOARD_PAGE("wwww.mypage/dashboard"),
    PROFILE_PAGE("wwww.mypage/profile_page");
    private String name;

    APIConstants(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }
}

