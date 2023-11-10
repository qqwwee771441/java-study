class ExperimentString {
	public static void main(String[] args) {
		String str = new String("String");
		StringBuilder sbd = new StringBuilder("StringBuilder");
		StringBuffer sbf;

		System.out.println("STRING");
		System.out.println(str);
		System.out.println(str.length());
		System.out.println(str.concat("CONCAT"));
		System.out.println( "1to4: " + (str.substring(1, 4)) );
		System.out.println( "equals: " + (str.equals("String")) );
		System.out.println( "compareTo: " + (str.compareTo("String")) );
		System.out.println( "Math.PI: " + (String.valueOf(Math.PI)) );

		System.out.println("STRINGBUILDER");
		System.out.println(sbd.toString());
		sbd.append("APPEND");
		System.out.println(sbd.toString());
		sbd.delete(1, 4);
		System.out.println("delete1to4: " + sbd.toString());
		sbd.insert(1, "INSERT");
		System.out.println("insert1" + sbd.toString());
		sbd.replace(1, 4, "REPLACE");
		System.out.println("replace1to4: " + sbd.toString());
		sbd.reverse();
		System.out.println("reverse: " + sbd.toString());
		System.out.println("substing1to4: " + sbd.substring(1, 4));

		System.out.println("SKIP StringBuffer");
	}
}
