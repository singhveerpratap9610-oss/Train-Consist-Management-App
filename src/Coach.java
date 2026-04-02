class Coach {
    int coachId;
    String coachType;

    Coach prev;
    Coach next;

    public Coach(int coachId, String coachType) {
        this.coachId = coachId;
        this.coachType = coachType;
        this.prev = null;
        this.next = null;
    }
}