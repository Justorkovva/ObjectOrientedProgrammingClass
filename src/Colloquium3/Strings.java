package Colloquium3;

import java.util.Set;
import java.util.TreeSet;

public class Strings {

private Set<String> strings = new TreeSet<>();
private StringBuilder sb;

Strings(String a, String b, String c, String d, String e)
{
sb = new StringBuilder();
strings.add(a);
strings.add(b);
strings.add(c);
strings.add(d);
strings.add(e);
}

public void PrintInAlphabeticalOrder() { 
for(String s : strings)
{
System.out.println(s);
}
}

public void JoinIntoOneString() {
//join into one string with coma between
int i=0;
for(String s : strings){ 
i++;
sb.append(s);
if(i!=strings.size())
{
sb.append(",");
}
}
System.out.println(sb.toString());
}

public void Reverse() 
{
// new joined string already exist in string builder
sb.reverse();
System.out.println(sb.toString());
}
}