# FS20-L07-AB
Verwenden Sie jeweils die vorgesehenen Packages zur Lösung dieser Aufgaben. Also z.B.
das Package **ch.fhnw.module07.ab1** für das **AB 7.1**. So finde ich Ihre Lösungen am schnellsten.
In dieser Lektion gibt es keine JUnit Tests. Wir programmieren so lange, bis das UI so wie auf den
Abbildungen (siehe Folien) ausschaut.

## AB 7.1 (EventHandler)
Implementieren Sie das UI gemäss der Folie AB 1 aus der Vorlesung.

## AB 7.2 (Slider)
Programmieren Sie das UI mit dem Slider wie auf der Folie AB2 aus der Vorlesung.

**Tipps:** Brauchen Sie `setShowTickMarks` und `setShowTickLabels`. Sie können das Major Tick Unit auf 1 setzen. Verwenden Sie den ChangeListener und fügen sie den Listener so hinzu: `slider.valueProperty().addListener(…)`. Verwenden Sie `String.valueOf(int number)` zur Konvertierung von Integers zu Strings.

## AB 7.3 (Slider, Bidirectional)
Implementieren Sie ein UI wie in AB3 auf den Folien dargestellt.

**Tipp:** Verwenden Sie ein TextField statt ein Label. Verbinden Sie den Slider  und das TextField bidirektional.

## AB 7.4 (Shuffle)
Erweitern Sie den bestehenden Code in **ab4** um einen EventHandler für den Button. 

**Tipp:** Shuffle ist bereits implementiert (FxCollections).
