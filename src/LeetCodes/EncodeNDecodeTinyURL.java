package LeetCodes;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

public class EncodeNDecodeTinyURL {
    public void ImplementFun(){
        String URL="https://leetcode.com/problems/design-tinyurl";
        System.out.println("URL: " + URL);
        System.out.println("\nEncode");

        String shorturl = encode(URL);
        System.out.println("Encode URL:"+shorturl);

        String longurl = decode(shorturl);
        System.out.println("\nDecode");
        System.out.println("Decode URL:"+longurl);

//            System.out.print("\n");
    }

    Map<String,String> AddressTable = new HashMap<String, String>();
    String hashcode ="";
    String PrefixAddr="http://tinyurl.com/";
    int count =0;
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
//        hashcode = Integer.toHexString(longUrl.hashCode());
        hashcode = String.valueOf(count++);
        AddressTable.put(hashcode,longUrl);
        return hashcode;
//        return "http://tinyurl.com/".concat(hashcode);
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        if (AddressTable.size()==0)
            return "";
        return AddressTable.get(shortUrl);
//        String[] partofUrl = shortUrl.split("/");
//        int index = partofUrl.length-1;
//        if (index==-1)
//            return "";
//        else
//            return AddressTable.get(partofUrl[index]);
    }

    String UseJavaLibraryEncode(String url) throws UnsupportedEncodingException {
//            return URLEncoder(url);
        return java.net.URLEncoder.encode(url,"UTF-16");
//            return java.net.URLEncoder.encode(url,"US-ASCII");
//            return java.net.URLEncoder.encode(url,"UTF-8");
    }
    String UseJavaLibraryDecode(String url){
//            return URLDecoder(url);
			try {
				return java.net.URLDecoder.decode(url,"UTF-16");
//                return java.net.URLDecoder.decode(url,"US-ASCII");
//                return java.net.URLDecoder.decode(url,"UTF-8");
//                return java.net.URLDecoder.decode(url,"Test");
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
				return "Error";

			}
//            return java.net.URLDecoder(url);
		}

//    TinyURL is a URL shortening service where you enter a URL such as
// https://leetcode.com/problems/design-tinyurl
//  http://tinyurl.com/4e9iAk.


// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));

}
