    private void sendGet() throws Exception { //因為只是範例,所以這裡沒有處理IOException

        String url = "https://tw.yahoo.com/"; //API的URL

        URL URLObject = new URL(url);
        HttpURLConnection con = (HttpURLConnection) URLObject.openConnection();
        con.setRequestMethod("GET"); // 設定成GET請求

        int responseCode = con.getResponseCode();
        System.out.println("\nSending 'GET' request to URL : " + url);
        System.out.println("Response Code : " + responseCode);

        // 讀取內容
        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();
        //假如有裝這包 org.apache.commons.io.IOUtils;
        //String json = IOUtils.toString(URLObject);

        System.out.println(response.toString());


        
//處理JSON建議用Jackson或GSON
        
//        FasterXML的Jackson
//        ObjectMapper mapper = new ObjectMapper();
//        ObjectNode rootNode = mapper.readValue(response.toString(), ObjectNode.class);

//        Google的GSON庫
//        JsonReader reader = new JsonReader(new StringReader(response.toString()));

    }
