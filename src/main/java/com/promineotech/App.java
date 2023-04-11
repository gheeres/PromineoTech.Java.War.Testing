package com.promineotech;

/**
 * The application runner.
 */
public class App {
  /**
   * The main entry point for the application.
   * @param args The command line arguments.
   */
  public static void main(String[] args) {
    new App().run(args);
  }
  
  /**
   * The runner / bootstrap from our application.
   * @param args The command line arguments.
   */
  public void run(String[] args) {
    Game game = new Game();
    game.play();
  }
}
