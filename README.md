# TicTacToe

Dieses Projekt ist eine einfache Implementierung des TicTacToe-Spiels in Java.

Inhalt

- [Über das Projekt](#über-das-projekt)
- [Installation](#installation)
- [Verwendung](#verwendung)
- [Features](#features)
- [CI/CD](#cicd)
- [Projektstruktur](#projektstruktur)

## Über das Projekt

Dieses Projekt implementiert ein TicTacToe-Spiel, das über die Konsole gespielt werden kann. Es unterstützt zwei Spieler, die abwechselnd ihre Züge machen, bis entweder einer der Spieler gewinnt oder das Spiel unentschieden endet.

## Installation

1. Voraussetzungen:
- Java Development Kit (JDK) 11 oder höher
- Apache Maven

2.  Schritte zur Installation:
Klone das Repository:
git clone https://github.com/goekz62/TicTacToe.git
cd TicTacToe

## Verwendung

1. Starten des Spiels:
- Nach der Installation kannst du das Spiel über die Kommandozeile starten:

java -cp target/tictactoe-1.0-SNAPSHOT.jar org.example.tictactoe.TicTacToe

2. Spielanleitung:
- Das Spiel wird im Terminal gespielt. Spieler geben ihre Züge ein, indem sie die Reihe und die Spalte für ihren Zug angeben (z.B., "1 1" für die Mitte).

## Features

- Spielzug machen: Spieler können abwechselnd ihre Züge machen.
- Spielbrett anzeigen: Das Spielbrett wird nach jedem Zug aktualisiert angezeigt.
- Spielende erkennen: Das Spiel erkennt automatisch, wenn ein Spieler gewonnen hat oder das Spiel unentschieden endet.
- Neues Spiel starten: Nach dem Ende eines Spiels kann ein neues Spiel gestartet werden, ohne die Anwendung neu zu starten.
- Spielerwechsel: Nach jedem Zug wechselt das Spiel automatisch den Spieler.

## Workflow-Datei:
Die CI/CD-Konfiguration befindet sich in .github/workflows/ci.yml. Diese Datei konfiguriert den Workflow, um das Projekt zu bauen und die Tests bei jedem Push oder Pull-Request auszuführen.

## Projektstruktur
src/main/java: Enthält den Quellcode des Projekts.
src/test/java: Enthält die Unit-Tests für das Projekt.
.github/workflows: Enthält die GitHub Actions Workflow-Datei für CI/CD.
pom.xml: Maven Projektdatei, die Abhängigkeiten und Build-Konfigurationen definiert.
