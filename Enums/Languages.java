package pkg2;

/**
 * Created by itml on 26.03.2017.
 */
public enum Languages {
    PL, EN, DE, ES, RU;

    @Override
    public String toString() {
        return "Languages: " + name();
    }
}
