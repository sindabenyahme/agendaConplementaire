package agenda;
import java.time.LocalDate;
import java.util.*;

/**
 * Description : An agenda that stores events
 */
public class Agenda {
    /**
     * Adds an event to this agenda
     *
     * @param e the event to add
     */
    private ArrayList<Event> events = new ArrayList<>();

    public Agenda() {
    }
    public Agenda(ArrayList<Event> events) {
        this.events = events;
    }

    public void addEvent(Event e) {
        events.add(e);
    }

    /**
     * Computes the events that occur on a given day
     *
     * @param day the day toi test
     * @return and iteraror to the events that occur on that day
     */
    public ArrayList<Event> eventsInDay(LocalDate day) {
        ArrayList<Event> eventsToDay = new ArrayList<>();
        for (Event e : events){
            if (e.isInDay(day)){
                eventsToDay.add(e);
            }
        }
        return eventsToDay;
    }


    /**
     * Trouver les événements de l'agenda en fonction de leur titre
     *
     * @param title le titre à rechercher
     * @return les événements qui ont le même titre
     */
    public List<Event> findByTitle(String title) {
        List<Event> eventsWithTitle = new ArrayList<>();
        for (Event e : events) {
            if (e.getTitle().equals(title)) {
                eventsWithTitle.add(e);
            }
        }
        return eventsWithTitle;
    }

}
