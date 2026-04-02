class Train {
    private Coach head;
    private Coach tail;

    // Add coach at end
    public void addCoach(int id, String type) {
        Coach newCoach = new Coach(id, type);

        if (head == null) {
            head = tail = newCoach;
        } else {
            tail.next = newCoach;
            newCoach.prev = tail;
            tail = newCoach;
        }

        System.out.println("Coach added: " + id + " (" + type + ")");
    }

    // Remove coach by ID
    public void removeCoach(int id) {
        Coach temp = head;

        while (temp != null) {
            if (temp.coachId == id) {
                if (temp.prev != null)
                    temp.prev.next = temp.next;
                else
                    head = temp.next;

                if (temp.next != null)
                    temp.next.prev = temp.prev;
                else
                    tail = temp.prev;

                System.out.println("Coach removed: " + id);
                return;
            }
            temp = temp.next;
        }

        System.out.println("Coach not found!");
    }

    // Display train
    public void displayTrain() {
        Coach temp = head;

        System.out.println("\nTrain Consist:");
        while (temp != null) {
            System.out.print("[" + temp.coachId + "-" + temp.coachType + "] <-> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}