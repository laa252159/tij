import java.util.Locale;
import java.util.ResourceBundle;

public class LocaleTest {
    public static void main(String[] args) {
//        Locale hu = Locale.forLanguageTag("hu-HU");
//        Locale fr = Locale.FRANCE;
//        Locale en = Locale.ENGLISH;
//        Locale ru = Locale.forLanguageTag("ru-RU");
        Locale[] locales = Locale.getAvailableLocales();
        System.out.println("Name\t\t | language\t\t | code");
        for(Locale locale : locales){

            System.out.println(locale.getDisplayName() + "\t\t | "+ locale.getLanguage() + "\t\t | " + locale.getDisplayLanguage(locale));
        }
        Locale hu = new Locale("hu","HU");
//        System.out.println(en.getDisplayLanguage(fr));
//        System.out.println(en.getDisplayLanguage(hu));
//        System.out.println(en.getDisplayLanguage(ru));

    }
}
