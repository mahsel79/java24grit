# Sammanfattning
Idag har vi pratat och gått igenom grafisk utveckling i Java. Vi har pratat om komponenter, layouter, getters/setter, lyssnare och allt runt om detta. Vi har gått igenom övningsuppften för lektionen
och likaså del 2 av övning (två separata filer i class-room). Under lektionen så gjorde vi de första 2 övningsuppifterna i dokument 1, fortsatte sen med dokument 2 - för att sen gå tillbaka till dokument1
och slutför resterande övningar.

På vägen har vi testat 3 olika layouts. Detta kommer vi fortsätta med nästa lektion. Vi har även gått igenom om hur vi kan sätta lyssnare på en knapp och hur vi kan bestämma vad som görs
vi klick.

# Grafisk programmering i Java
Vi jobbar i denna kurs med Swing. Dock finns det andra alternativ. Föregångaren AWT, som fortfarande äger en del av funktionaliteten även när vi jobbar med Swing. JavaFX är också presenterad och tillhör
en liten av-art av grafiskt programmering, men som fanns med i JDK fram till version 8.

### AWT
Vad är AWT?

AWT är den ursprungliga biblioteket för att skapa grafiska användargränssnitt i Java. Det introducerades i Java 1.0 och var det första verktyget för att skapa GUI-applikationer i Java.

__Funktioner:__

Plattformsberoende: AWT är nära kopplat till det underliggande operativsystemets grafiska användargränssnitt (GUI), vilket innebär att den använder de inbyggda GUI-komponenterna från OS . 
Därför ser applikationer som använder AWT olika ut på olika plattformar. 

__Färre komponenter:__ AWT tillhandahåller en mindre uppsättning GUI-komponenter (t.ex. Button, TextField, Label, etc.), och dessa komponenter är inte lika rika eller flexibla som de i senare ramverk. 

__Händelsehantering:__ AWT använder händelsehantering (event handling) via listeners, som gör att du kan definiera hur användarinteraktioner som knapptryckningar ska hanteras.

__Nackdelar:__

__Begränsad funktionalitet:__ AWT erbjuder en ganska grundläggande uppsättning GUI-komponenter och saknar många av de mer avancerade funktionerna som senare ramverk som Swing och JavaFX erbjuder.

__Plattformsberoende utseende:__ Eftersom AWT använder native komponenter för varje operativsystem kan GUI
se olika ut beroende på vilket operativsystem applikationen körs på.svis, anonyma klasser i Java är användbara när man behöver skapa en instans av en klass eller ett interface för en tillfällig användning, särskilt när man arbetar med händelsehantering eller andra tillfälliga operationer.


### Swing

Vad är Swing?

Swing är ett bibliotek som introducerades i Java 1.2 för att bygga grafiska användargränssnitt och var tänkt att vara ett mer kraftfullt och plattformsoberoende alternativ till AWT. Det bygger på AWT, men det är helt skrivet i Java och använder inte de inbyggda operativsystemskomponenterna.

__Funktioner:__

__Plattformsoberoende:__ Till skillnad från AWT är Swing helt skrivet i Java och använder inte native komponenter. Därför ser Swing-applikationer lika ut på alla plattformar.

__Rich Components:__ Swing erbjuder ett större urval av avancerade GUI-komponenter, som till exempel JButton, JLabel, JTextField, JTable, och JTree.

__Flexibilitet och anpassning:__ Swing tillåter användare att enkelt anpassa utseendet på komponenterna via så kallad "Look and Feel", vilket innebär att användare kan ändra hur GUI
ser ut utan att ändra koden för komponenterna.

__Stöd för grafik:__ Swing innehåller också fler funktioner för att rita grafik på skärmen och stöd för 2D-grafik, vilket gör det mer flexibelt än AWT.

__Nackdelar:__

__Prestanda:__ Eftersom Swing är ett rent Java-bibliotek kan det vara långsammare än AWT, som använder native komponenter.

__Komplexitet:__ Swing är mer omfattande och kan vara svårare att använda än AWT för enklare applikationer.

### JavaFX
Vad är JavaFX?

JavaFX är ett modernare ramverk för att bygga rika grafiska användargränssnitt i Java. Det introducerades i Java 7 och blev en del av Java SE i version 8. JavaFX är designat för att ge bättre prestanda och fler funktioner än både AWT och Swing, och är främst inriktat på att skapa rika, interaktiva användargränssnitt.

__Funktioner:__

__Moderna UI-komponenter:__ JavaFX erbjuder ett brett urval av avancerade komponenter som t.ex. knappar, textfält, tabeller, listor, grafik, animationer, och 3D-grafik.

__Skalbar vektorbaserad grafik:__ JavaFX använder sig av vektorgrafik (t.ex. SVG), vilket gör att gränssnittet kan skalas upp och ner utan att förlora kvalitet.
    
__CSS-styling:__ JavaFX stöder CSS (Cascading Style Sheets) för att anpassa utseendet på användargränssnittet, vilket ger en enkel och kraftfull metod att styla applikationer.

__Animation och multimedia:__ JavaFX har inbyggt stöd för att hantera animationer, ljud och video, vilket gör det bra för att skapa rika interaktiva applikationer.

__Plattformsoberoende:__ Precis som Swing är JavaFX plattformsoberoende, vilket innebär att det ser lika ut på alla operativsystem.

__Nackdelar:__

__Större inlärningströskel:__ Eftersom JavaFX är ett mer avancerat ramverk kan det vara svårare att lära sig och använda än AWT och Swing, särskilt för nya utvecklare.
Inte lika populärt som webbaserade teknologier: Trots sina kraftfulla funktioner är JavaFX inte lika populärt för webb- eller mobilutveckling, och många utvecklare har gått över till webbaserade teknologier som HTML5, CSS och JavaScript.

### Sammanfattning AWT, Swing och JavaFX
__AWT:__ Det ursprungliga biblioteket för att skapa grafiska användargränssnitt i Java, men det är begränsat och plattformsberoende.

__Swing:__ Ett mer kraftfullt och plattformsoberoende alternativ till AWT, med fler komponenter och bättre flexibilitet.

__JavaFX:__ Det modernaste GUI-biblioteket i Java, med stöd för avancerad grafik, animationer och multimedia, samt CSS-styling för användargränssnittet.

# Delar
### JFrame
JFrame är en av de mest grundläggande och centrala komponenterna i Java Swing, som används för att skapa ett fönster i en grafisk användargränssnitt (GUI) applikation. Här är en översikt över dess funktioner och användning:

__Definition:__ JFrame är en subklass av Frame och en del av Swing-biblioteket. Den representerar ett fönster med en titel, kan innehålla olika komponenter (som knappar, textfält, paneler, etc.) och hanterar olika användarinteraktioner.

__Innehållspanel:__ Varje JFrame har en innehållspanel (content pane) där du kan lägga till andra Swing-komponenter. När du lägger till komponenter till JFrame, läggs de i dess innehållspanel.
### JPanel
JPanel är en viktig komponent i Java Swing som används som en behållare för andra komponenter. Här är en detaljerad beskrivning av JPanel och dess funktioner:

__Definition:__ JPanel är en subklass av JComponent och fungerar som en allmän behållare för att gruppera och organisera andra Swing-komponenter.

__Flexibilitet:__ Den kan användas för att skapa komplexa gränssnitt genom att arrangera olika komponenter tillsammans och kan också kombineras med olika layoutmanagers för att styra hur dessa komponenter placeras.

### JButton
JButton är en av de mest använda komponenterna i Java Swing och representerar en knapp i ett grafiskt användargränssnitt (GUI). Här är en detaljerad beskrivning av JButton och dess funktioner:

__Definition:__ JButton är en subklass av AbstractButton och används för att skapa knappar som användare kan klicka på för att utföra en åtgärd eller kommando.

### JLabel
JLabel är en grundläggande komponent i Java Swing som används för att visa text eller ikoner i ett grafiskt användargränssnitt (GUI). Här är en detaljerad beskrivning av JLabel och dess funktioner:

__Definition:__ JLabel är en subklass av JComponent och används främst för att visa statisk text eller bilder utan att ge användaren möjlighet att interagera med den.

### JTextArea
JTextArea är en komponent i Java Swing som används för att visa och redigera flerradig text. Här är en detaljerad beskrivning av JTextArea och dess funktioner:
Beskrivning

__Definition:__ JTextArea är en subklass av JTextComponent och används för att skapa ett textområde där användare kan skriva, redigera och visa text över flera rader.

### JTextInput
JTextField är en komponent i Java Swing som används för att skapa ett enradigt textinmatningsfält. Det är en av de grundläggande komponenterna för att ta emot användarinmatning av text i grafiska användargränssnitt (GUI). Här är en detaljerad beskrivning av JTextField och dess funktioner:

__Definition:__ JTextField är en subklass av JTextComponent och används för att fånga korta textsträngar, som namn, adresser, sökfrågor eller annan enkel information.


# Layout
Det går att sätta specifika layouter på `JPanel`, `JRootPane`, `JScrollPane`, `JLayeredPane`, `JTabbedPane`, `JSplitPane`, `JToolBar`, `JDialog` och `JFrame`

FlowLayout Doc: 
https://docs.oracle.com/javase/tutorial/uiswing/layout/flow.html

BorderLayout Doc:
https://docs.oracle.com/javase/tutorial/uiswing/layout/border.html

GridLayout Doc:
https://docs.oracle.com/javase/tutorial/uiswing/layout/grid.html


# Lyssnare och eventhandlers
Oavsett vilket språk vi jobbar med, är event mångt och mycket som koncept detsamma. Syntaxen skiljer sig mellan språken, men upplägget och funktion är densamma.

### 1. Event

Ett event representerar en händelse som inträffar när användaren interagerar med GUI-komponenterna, som att klicka på en knapp, skriva text i ett textfält eller röra musen över en komponent.

    Vad gör ett Event?
    Ett event kapslar in information om en användarinteraktion. Exempel på olika event är:
        ActionEvent (t.ex. när en knapp klickas på)
        MouseEvent (t.ex. när musen rör sig eller ett musknappstryck inträffar)
        KeyEvent (t.ex. när en tangent trycks ned)
        WindowEvent (t.ex. när ett fönster stängs eller minimeras)
    Vad innehåller ett Event?
    Ett eventobjekt innehåller detaljer som:
        Typen av händelsen (vilken typ av interaktion som inträffade)
        Tidpunkten för händelsen
        Eventuella ytterligare detaljer, som positionen på skärmen (i fallet med mus-händelser), eller den tangent som trycktes ner (i fallet med tangentbordshändelser).

### 2. Eventkälla (Event Source)

Eventkällan är den komponent (som en knapp, ett textfält, eller ett fönster) som genererar händelsen. Eventkällan är alltså objektet som användaren interagerar med för att trigga ett event.

    Exempel på eventkällor:
        En knapp (JButton i Swing eller Button i AWT)
        Ett textfält (JTextField eller TextField)
        Ett fönster (JFrame eller Frame)
    Vad gör Eventkällan?
    Eventkällan ansvarar för att skapa och skicka event till de lyssnare (listeners) som har registrerats för den.

### 3. Eventlyssnare (Event Listener)

En eventlyssnare är ett objekt som "lyssnar" på specifika typer av events som inträffar på en eventkälla. Listenern är ansvarig för att ta emot eventet och reagera på det när det inträffar.

    Vad gör en Eventlyssnare?
    När en eventkälla skickar ett event, måste en eventlyssnare vara registrerad för att ta emot och bearbeta detta event. Eventlyssnaren är ett objekt som implementerar ett eller flera gränssnitt (interfaces) som definierar hur man hanterar specifika event.

    Vanliga Eventlyssnare:
        ActionListener (för knapptryckningar, menyer)
        MouseListener (för mus-interaktioner som klick och rörelser)
        KeyListener (för tangentbordshändelser)
        WindowListener (för fönsterhändelser, t.ex. när ett fönster stängs)

### 4. Händelsehanterare (Event Handler)

En händelsehanterare är själva metoden som hanterar det mottagna eventet. Denna metod utför någon åtgärd när ett event inträffar. I Java innebär detta vanligtvis en metod som är definierad i en eventlyssnare. Händelsehanteraren är alltså där själva "logiken" för hur programmet ska reagera på eventet är definierad.

    Vad gör en Händelsehanterare? Händelsehanteraren är metoden som implementerar den logik som ska utföras när en viss händelse inträffar. Detta kan vara att uppdatera GUI
    , göra beräkningar, visa ett meddelande eller någon annan åtgärd som applikationen ska ta vid den specifika interaktionen.


### De fyra delarna av eventhantering i Java är:

    Event: Objektet som representerar en användarinteraktion (t.ex. knapptryckning, musrörelse).
    Eventkälla: Den komponent som genererar eventet (t.ex. en knapp, ett textfält).
    Eventlyssnare: Ett objekt som registreras för att lyssna på event och ta emot eventen (t.ex. ActionListener, MouseListener).
    Händelsehanterare: Metoden som definieras för att utföra åtgärder när eventet inträffar (t.ex. att skriva ut ett meddelande när en knapp klickas på).

Tillsammans möjliggör dessa fyra delar att ett program kan reagera på användarinteraktioner och utföra åtgärder i realtid.


# Anonym klass
En anonym klass i Java är en specialtyp av klass som inte har något namn och skapas vid behov, vanligtvis för att implementera ett interface eller en abstrakt klass. Den används ofta för att skapa en enkel instans av en klass eller ett interface i situationer där man inte behöver en separat, namngiven klassdefinition.

Anonyma klasser definieras direkt i koden där de används, och de kan implementera metoder eller överskriva metoder i en existerande klass eller interface.

Exempel på en anonym klass finns när vi skapar vår `actionListener`:

```
button.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Button clicked!");
    }
});
```

I detta exempel skapas en anonym klass som implementerar `ActionListener-interfacet` och överskriver `actionPerformed-metoden` för att definiera specifik funktionalitet när en knapp klickas.

# Skapa dina egna klasser - bra grejer!
Det går alldeles utmärkt att skapa klasser som baseras på __Swings__ komponenter (`JComponents`).
Om du till exempel vill skapa något i form av en sektion i ditt program, går kan du till exempel använda dig av `JPanel`. Som vi övat på, kan en JPanel innehålla andra komponenter. Därav kan detta vara en bra komponent
att bygga vidare på. Där finns givetvis andra "panels" att välja på. Exempelvis finns det panels att använda specifik om du vet om att det bör vara scroll-bara. Med detta sagt så är det bästa alternativet __inte__ alltid JPanel.

Men ponera att vi som sagt vill skapa en sektion / del av något i vårt grafiska program. Då kan vi skapa en ny klass som vi exempelvis kallar för `Section`. `Section` kan vara en förlägning av JPanel.
Då skulle det kunna se ut ungefär som följer:

```
public class Section extends JPanel {
    JButton knapp = new JButton();
    
    public Section() {
        this.add(knapp);
    }
}
```

Vi kan alltså fylla hela klassen med de componenter vi vill ha med. Det kan vara knappar, inputs, labels osv. 

Fördelen här är att vi kan bestämma utseende och beteende direkt i klassen. Det gör att när vi skapar objekt av klassen Section,
så behöver vi inte applicera massa grejer med set-metoder. Dessa egenskaper har vi redan bestämt. Detta gör att instansieringen och 
arbetet blir clean-t! Bra grejer!

Om ni väljer att skapa egna klasser, kan dessa med fördel läggas i ett eget paket/mapp i projektet - exempelvis `src/components`


# Tips
Oavsett om du jobbar med grafik eller diverse problem - __ha alltid papper och penna till din hjälp!__.  Dela upp problemställningen
och ta bit för bit. Börja __INTE__ med allt samtidigt. När du jobbar med Swing och har en bild på hur ett slutresultat kan se ut - bryt ner bilden.
Rita, skriv kommentarer, pseudokod eller vad som nu hjälper dig mest. Men håll __INTE__ allt i huvudet. Få ner det på papper! Även om vi inte gått på djupet med UML, så kan det vara idé att kolla på detta, på egen hand!

# Tips #2
När vi skapar en JFrame och lägger till grejer i den - bör vi alltid sluta med `frame.pack()` och `frame.setVisible(true)`.
När vi lägger till komponenter så bör vi, inte minst för vår egen skull, göra allt i en logisk ordning..


### frame.pack()
Denna metod är `deprecated` - vilket innebär att den inte längre bör användas. Dock kan den fortsatt fylla funktion. Det är bra att känna till den
och använda den.

```
Causes this Window to be sized to fit the preferred size and layouts of its subcomponents. The resulting width and height of the window are automatically enlarged if either of dimensions is less than the minimum size as specified by the previous call to the setMinimumSize method.
If the window and/ or its owner are not displayable yet, both of them are made displayable before calculating the preferred size. The Window is validated after its size is being calculated.
```

### frame.setVisible()
```
Shows or hides this Window depending on the value of parameter b.
If the method shows the window then the window is also made focused under the following conditions:
The Window meets the requirements outlined in the isFocusableWindow method.
The Window's autoRequestFocus property is of the true value.
Native windowing system allows the Window to get focused.
```

### frame.show()
```
Makes the Window visible. If the Window and/ or its owner are not yet displayable, both are made displayable. The Window will be validated prior to being made visible. If the Window is already visible, this will bring the Window to the front.
```

# Att läsa vidare 
Om Swing - https://docs.oracle.com/javase/tutorial/uiswing/

JFrame - https://docs.oracle.com/javase/7/docs/api/javax/swing/JFrame.html

Containers - https://docs.oracle.com/javase/7/docs/api/java/awt/Container.html

JLabel - https://docs.oracle.com/javase/7/docs/api/javax/swing/JLabel.html

JButton - https://docs.oracle.com/javase/7/docs/api/javax/swing/JButton.html

JPanel - https://docs.oracle.com/javase/7/docs/api/javax/swing/JPanel.html

Interface - https://docs.oracle.com/javase/tutorial/java/IandI/createinterface.html