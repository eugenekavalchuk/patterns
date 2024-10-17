package tasks.signs;

public enum ZodiacSign {
    ARIES("Овен"),
    TAURUS("Телец"),
    GEMINI("Близнецы"),
    CANCER("Рак"),
    LEO("Лев"),
    VIRGO("Дева"),
    LIBRA("Весы"),
    SCORPIO("Скорпион"),
    SAGITTARIUS("Стрелец"),
    CAPRICORN("Козерог"),
    AQUARIUS("Водолей"),
    PISCES("Рыбы");

    private final String name;

    ZodiacSign(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static ZodiacSign fromName(String name) {
        for (ZodiacSign sign : ZodiacSign.values()) {
            if (sign.getName().equalsIgnoreCase(name)) {
                return sign;
            }
        }
        return null;
    }
}
