package com.leanplum.internal.http;

import android.content.Context;
import com.leanplum.Leanplum;
import com.leanplum.internal.APIConfig;
import com.leanplum.internal.Constants;
import com.leanplum.internal.RequestBuilder;
import com.leanplum.internal.Util;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.zip.GZIPInputStream;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import org.json.JSONObject;
import org.json.JSONTokener;

/* loaded from: classes.dex */
public abstract class LeanplumHttpConnection {
    protected HttpURLConnection urlConnection;

    private String createUserAgent() {
        String strCreateUserAgentString = createUserAgentString();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strCreateUserAgentString.length(); i++) {
            char cCharAt = strCreateUserAgentString.charAt(i);
            if (cCharAt == '\t' || (' ' <= cCharAt && cCharAt <= '~')) {
                sb.append(cCharAt);
            }
        }
        return sb.toString();
    }

    private String createUserAgentString() {
        Context context = Leanplum.getContext();
        StringBuilder sb = new StringBuilder();
        sb.append(Util.getApplicationName(context));
        sb.append("/");
        sb.append(Util.getVersionName());
        sb.append("/");
        sb.append(APIConfig.getInstance().appId());
        sb.append("/");
        sb.append(Constants.CLIENT);
        sb.append("/");
        sb.append(Constants.LEANPLUM_VERSION);
        sb.append("/");
        sb.append(Util.getSystemName());
        sb.append("/");
        sb.append(Util.getSystemVersion());
        sb.append("/");
        return z1m.l(sb, Constants.LEANPLUM_SUPPORTED_ENCODING, "/s");
    }

    private boolean isGzipCompressed() {
        String headerField = this.urlConnection.getHeaderField("content-encoding");
        if (headerField != null) {
            return headerField.trim().equalsIgnoreCase(Constants.LEANPLUM_SUPPORTED_ENCODING);
        }
        return false;
    }

    public void connect() throws IOException {
        this.urlConnection.connect();
    }

    public void disconnect() {
        this.urlConnection.disconnect();
    }

    public JSONObject getJsonResponse() {
        return new JSONObject(new JSONTokener(getResponse()));
    }

    public String getResponse() throws IOException {
        int responseCode = this.urlConnection.getResponseCode();
        HttpURLConnection httpURLConnection = this.urlConnection;
        InputStream inputStream = responseCode < 400 ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
        if (isGzipCompressed()) {
            inputStream = new GZIPInputStream(inputStream);
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String line = bufferedReader.readLine();
            if (line != null) {
                sb.append(line);
                sb.append("\n");
            } else {
                try {
                    break;
                } catch (Exception unused) {
                }
            }
        }
        inputStream.close();
        bufferedReader.close();
        return sb.toString();
    }

    public int getResponseCode() {
        return this.urlConnection.getResponseCode();
    }

    public URL getURL() {
        return this.urlConnection.getURL();
    }

    public void initConnection(String str, String str2, String str3, boolean z, int i) throws ProtocolException {
        if (str2 == null || !str2.startsWith("http")) {
            str2 = p3p.n(new StringBuilder(z ? "https://" : "http://"), str, "/", str2);
        }
        initConnection(str2, str3, z, i);
    }

    public void initConnection(String str, String str2, boolean z, int i) throws ProtocolException {
        this.urlConnection = (HttpURLConnection) new URL(str).openConnection();
        if (z) {
            ((HttpsURLConnection) this.urlConnection).setSSLSocketFactory((SSLSocketFactory) SSLSocketFactory.getDefault());
        }
        int i2 = i * 1000;
        this.urlConnection.setReadTimeout(i2);
        this.urlConnection.setConnectTimeout(i2);
        this.urlConnection.setRequestMethod(str2);
        this.urlConnection.setDoOutput(RequestBuilder.POST.equals(str2));
        this.urlConnection.setDoInput(true);
        this.urlConnection.setUseCaches(false);
        this.urlConnection.setInstanceFollowRedirects(true);
        this.urlConnection.setRequestProperty("User-Agent", createUserAgent());
        this.urlConnection.setRequestProperty("Accept-Encoding", Constants.LEANPLUM_SUPPORTED_ENCODING);
    }

    public void saveResponse(OutputStream outputStream) throws IOException {
        InputStream inputStream = this.urlConnection.getInputStream();
        if (isGzipCompressed()) {
            inputStream = new GZIPInputStream(inputStream);
        }
        byte[] bArr = new byte[4096];
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                outputStream.close();
                return;
            }
            outputStream.write(bArr, 0, i);
        }
    }
}
