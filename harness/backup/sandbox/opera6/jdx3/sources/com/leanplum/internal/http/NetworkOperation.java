package com.leanplum.internal.http;

import android.net.Uri;
import com.leanplum.internal.Constants;
import com.leanplum.internal.Log;
import com.leanplum.internal.RequestBuilder;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ProtocolException;
import java.util.Map;

/* loaded from: classes.dex */
public class NetworkOperation extends LeanplumHttpConnection {
    public NetworkOperation(String str, String str2, Map<String, Object> map, String str3, boolean z, int i) throws IOException {
        String strAttachGetParameters = RequestBuilder.GET.equals(str3) ? attachGetParameters(str2, map) : str2;
        initConnection(str, strAttachGetParameters, str3, z, i);
        if (RequestBuilder.POST.equals(str3)) {
            attachPostParameters(map);
        }
        if (Constants.enableVerboseLoggingInDevelopmentMode && Constants.isDevelopmentModeEnabled) {
            Log.d("Sending request at path " + strAttachGetParameters + " with parameters " + map, new Object[0]);
        }
    }

    public NetworkOperation(String str, String str2, boolean z, int i) throws ProtocolException {
        initConnection(str, str2, z, i);
    }

    private static String attachGetParameters(String str, Map<String, Object> map) {
        if (map == null) {
            return str;
        }
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if (entry.getValue() != null) {
                builderBuildUpon.appendQueryParameter(entry.getKey(), entry.getValue().toString());
            }
        }
        return builderBuildUpon.build().toString();
    }

    private void attachPostParameters(Map<String, Object> map) throws IOException {
        OutputStream outputStream = this.urlConnection.getOutputStream();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"));
        bufferedWriter.write(getQuery(map));
        bufferedWriter.close();
        outputStream.close();
    }

    private static String getQuery(Map<String, Object> map) {
        if (map == null) {
            return "";
        }
        Uri.Builder builder = new Uri.Builder();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if (entry.getValue() == null) {
                Log.d(z1m.l(new StringBuilder("Request parameter for key: "), entry.getKey(), " is null."), new Object[0]);
            } else {
                builder.appendQueryParameter(entry.getKey(), entry.getValue().toString());
            }
        }
        return builder.build().getEncodedQuery();
    }
}
