package ex02.network;

import java.net.MalformedURLException;
import java.net.URL;

public class URLEx2 {
	public static void main(String[] args) throws MalformedURLException {
		URL url = new URL("https://www.google.com/search?q=kimyuna&ei=_hFGZPebJc-C-AbD7pvgDw&ved=0ahUKEwj3ks2A48H-AhVPAd4KHUP3BvwQ4dUDCA8&uact=5&oq=kimyuna&gs_lcp=Cgxnd3Mtd2l6LXNlcnAQAzIHCC4QgAQQCjIHCAAQgAQQCjIHCAAQgAQQCjIHCAAQgAQQCjIHCAAQgAQQCjIHCAAQgAQQCjIHCAAQgAQQCjIHCAAQgAQQCjIHCAAQgAQQCjIHCAAQgAQQCjISCC4QgAQQChDcBBDeBBDfBBgBOgsIABCABBCxAxCDAToUCC4QgAQQsQMQgwEQxwEQ0QMQ1AI6BAguEAM6BQgAEIAEOgQIABADOggILhCxAxCABDoOCC4QgAQQsQMQxwEQ0QM6CwguEIAEELEDEIMBOggIABCABBCxAzoLCC4QgAQQxwEQrwE6EwguELEDEIAEENwEEN4EEOAEGAE6EQguEIAEELEDEIMBEMcBENEDOhEILhCABBCxAxCDARDHARCvAToQCAAQgAQQsQMQgwEQRhD9AToHCC4QigUQQzoSCC4QigUQQxDcBBDeBBDfBBgBOg4ILhCDARDUAhCxAxCABDoICC4QgAQQsQM6BQguEIAEOgYIABAeEAo6BAgAEB46CQgAEB4Q8QQQCkoECEEYAFAAWPAzYJE2aANwAXgAgAFoiAGTB5IBAzkuMZgBAKABAbABAMABAdoBBggBEAEYFA&sclient=gws-wiz-serp");
	
		System.out.println("프로토콜 : "+ url.getProtocol());
		System.out.println("호스트와 포트 : "+ url.getAuthority());
		System.out.println("호스트 : "+ url.getHost());
		System.out.println("포트 : "+ url.getPort());
		System.out.println("경로 : "+ url.getPath());
		System.out.println("질의 : "+ url.getQuery());
		System.out.println("파일명 : "+ url.getFile());
		System.out.println("참조 : "+ url.getRef());
	}
}
