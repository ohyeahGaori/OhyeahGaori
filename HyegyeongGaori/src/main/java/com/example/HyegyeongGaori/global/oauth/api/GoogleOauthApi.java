package com.example.HyegyeongGaori.global.oauth.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;



@Slf4j
@RestController
// @RequestMapping("/oauth")

public class GoogleOauthApi {

    private String client_id = "";
    private String client_secret = "";
    private String redirect_uri = "";
    private String access_token_url = "";

    @GetMapping("/")
    public String home() {
        return "home"; // home.html 또는 다른 뷰 이름
    }

    // @GetMapping("/oauth/google-callback")
    @GetMapping("/login/oauth2/code/google")
    public ResponseEntity<String> GoogleSignCallback(HttpServletRequest request, HttpServletResponse response) throws Exception {

        log.info("callback log");

        // try {
        //     /* Access Token 얻기 */
        //     String accessToken = getGoogleAccessToken(request, response);
        //     /* 사용자 정보 얻기 */
        //     getGoogleUserInfo(accessToken);
        // } catch (Exception e) {
        //     // log.error(e);
        //     throw e;
        // }


        /* 임시 - 로그인 성공 창 */
        return ResponseEntity.ok("Welcome! You have logged in successfully.");

    }

    // public String getGoogleAccessToken(HttpServletRequest request, HttpServletResponse response) throws Exception {
	
    //     String code = request.getParameter("code");
    //     //여기서 다시 code를 받아온다.

    //     // 여기서 HttpURLConnection 또는 RestTemplate 을 이용해 
    //     // google 서버에 요청을 보낼 수 있게 한다.
    //     HttpHeaders headers = new HttpHeaders();
    //     RestTemplate restTemplate = new RestTemplate();
    //     headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

    //     // 파라미터 값 설정
    //     MultiValueMap<String, String> parameters = new LinkedMultiValueMap<>();
    //     parameters.add("code", code);
    //     parameters.add("client_id", client_id);
    //     parameters.add("client_secret", client_secret);
    //     parameters.add("redirect_uri", redirect_uri);
    //     parameters.add("grant_type", "authorization_code"); // 생략 가    

    //     // 무슨 역할인지 잘 모르겠으나 아래 코드에서 안쓰이는거보면 생략 가능할지도?
	//     HttpEntity<MultiValueMap<String, String>> rest_request = new HttpEntity<>(parameters, headers);   

    //     // access token 요청을 보낼 uri 객체 생성 (URL도 가능하다.)
    //     URI uri = URI.create(access_token_url);
            
    //     ResponseEntity<String> responseEntity;
    //     responseEntity = restTemplate.postForEntity(uri, rest_request, String.class);
    //     // post요청에 대한 결과를 ResponseEntity로 반환한다.
    //     String bodys = responseEntity.getBody();
    //     log.info("## BODYS = {}", bodys);
            
    //     // // 결과값을 json형태로 변환
    //     JsonParser jsonParser = new JsonParser();
    //     JsonElement jsonElement = jsonParser.parse(bodys);
        
    //     // // Json Object에서 access_token값만을 반환
    //     // return jsonElement.getAsJsonObject().get("access_token").getAsString();
    //     return "token";
    // }

    // public void getGoogleUserInfo(String accessToken) throws Exception {
    // // token을 전달받는다.

    //     // 사용자의 정보를 저장할 HashMap
    //     HashMap<String, Object> googleUserInfo = new HashMap<>();
    
    //     // 공식 홈페이지에도 나와있는 token을 이용한 정보 요청
    //     String reqURL = "https://www.googleapis.com/oauth2/v1/userinfo?alt=json&access_token=" + accessToken;
        
    //     try {
    //         // token 요청을 위한 url 객체 생성
    //         URL url = new URL(reqURL);
    //         HttpURLConnection conn = (HttpURLConnection) url.openConnection();
    
    //         // Header에 token을 담은 후 요
    //         conn.setRequestProperty("Authorization", "Bearer " + accessToken);
    
    //         // response code를 받아
    //         int responseCode = conn.getResponseCode();
    //         // log.info("## ResponseCode : {}", responseCode);
        
    //         // response code가 200일때
    //         if (responseCode == 200) {
            
    //             BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));

    //             String line = "";
    //             String result = "";
    //             while ((line = br.readLine()) != null) {
    //                 // 한줄씩 읽어서 result에 저장
    //                 result += line;
    //             }
        
    //             // result를 JSON형태로 변환
    //             JsonParser parser = new JsonParser();
    //             JsonElement element = parser.parse(result);
                
    //             // 결과값 추출
    //             String name = element.getAsJsonObject().get("name").getAsString();
    //             String email = element.getAsJsonObject().get("email").getAsString();
    //             String id = "GOOGLE_" + element.getAsJsonObject().get("id").getAsString();
        
    //             log.info("name : ", name, "email : ", email, "id : ", id);

    //             // // 결과를 DTO에 저
    //             // googleUserInfo.put("name", name);
    //             // googleUserInfo.put("email", email);
    //             // googleUserInfo.put("id", id);

    //             // log.info("## Login Controller : {}", googleUserInfo);
    //         }    

    //     } catch (Exception e) {
    //         // log.error(e);
    //         throw e;
    //     }

    // } 
    

}
