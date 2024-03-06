package Ken;
class ken{
   public void publicMethod() {
        //番号入力
        Scanner scanner = new Scanner(System.in);
	 String hobby = scanner.nextLine();
	  String[] tokens = hobby.split(",");
	  	  int[] newArr = Stream.of(tokens).mapToInt(Integer::parseInt).toArray();
	  	  Arrays.sort(newArr);
	  	    // データ
        String[] date = {"北海道:札幌市:83424","青森県:青森市:9646","岩手県:盛岡市:15275","宮城県:仙台市:7282","秋田県:秋田市:11638","山形県:山形市:9323","福島県:福島市:13784","茨城県:水戸市:6097","栃木県:宇都宮市:6408","群馬県:前橋市:6362","埼玉県:さいたま市:3798"};
        for (int i = 0 ; i < tokens.length; i++){
        String[] tokens2 = date[newArr[i] - 1].split(":");
          // 使用時
     System.out.println("都道府県名："+tokens2[0]);
     System.out.println("県庁所在地："+tokens2[1]);
     System.out.println("面積："+tokens2[2]+"km2");
     System.out.println("");
        }
    }
}
class ken2{
    public void publicMethod2() {
        //番号入力
        Scanner scanner = new Scanner(System.in);
	 String hobby = scanner.nextLine();
	  String[] tokens = hobby.split(",");
	  	  int[] newArr = Stream.of(tokens).mapToInt(Integer::parseInt).toArray();
	  	  Arrays.sort(newArr);
	  	    // データ
        String[] date = {"北海道:札幌市:83424","青森県:青森市:9646","岩手県:盛岡市:15275","宮城県:仙台市:7282","秋田県:秋田市:11638","山形県:山形市:9323","福島県:福島市:13784","茨城県:水戸市:6097","栃木県:宇都宮市:6408","群馬県:前橋市:6362","埼玉県:さいたま市:3798"};
        for (int i = tokens.length ; i < 0; i--){
        String[] tokens2 = date[newArr[i] - 1].split(":");
          // 使用時
     System.out.println("都道府県名："+tokens2[0]);
     System.out.println("県庁所在地："+tokens2[1]);
     System.out.println("面積："+tokens2[2]+"km2");
     System.out.println("");
        }
    }
}
