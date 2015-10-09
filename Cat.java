import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class Cat {
  public static void main(String[] args) throws IOException {
  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  String line;
  while ((line = reader.readLine()) != null)
    System.out.println(line);
  }
}
