package AbstractFactory;

import AbstractFactory.Website.WebsiteTeamFactory;

class AuctionSiteProject {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebsiteTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager pm = projectTeamFactory.getProjectManager();

        System.out.println("Creating auction site...");
        developer.writeCode();
        tester.testCode();
        pm.manageProject();
    }
}
