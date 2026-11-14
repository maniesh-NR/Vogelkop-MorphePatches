package com.leanplum.internal.http;

import com.leanplum.internal.Log;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ProtocolException;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public class UploadOperation extends LeanplumHttpConnection {
    private static final String BOUNDARY = "==================================leanplum";
    private static final String CONTENT_TYPE = "Content-Type: application/octet-stream";
    private static final String LINE_END = "\r\n";
    private static final String TWO_HYPHENS = "--";

    public UploadOperation(String str, String str2, String str3, boolean z, int i) throws ProtocolException {
        initConnection(str, str2, str3, z, i);
    }

    private void writeEnd(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeBytes("--==================================leanplum--\r\n");
    }

    private boolean writeFile(DataOutputStream dataOutputStream, String str, String str2, InputStream inputStream, int i) throws IOException {
        writeFileHeader(dataOutputStream, str, i);
        if (!writeFileContent(dataOutputStream, str2, inputStream)) {
            return false;
        }
        writeFileEnd(dataOutputStream);
        return true;
    }

    private boolean writeFileContent(DataOutputStream dataOutputStream, String str, InputStream inputStream) throws IOException {
        byte[] bArr = new byte[4096];
        while (true) {
            try {
                try {
                    int i = inputStream.read(bArr);
                    if (i == -1) {
                        try {
                            inputStream.close();
                            return true;
                        } catch (IOException e) {
                            Log.d("Failed to close InputStream: " + e, new Object[0]);
                            return true;
                        }
                    }
                    dataOutputStream.write(bArr, 0, i);
                } catch (Throwable th) {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException e2) {
                            Log.d("Failed to close InputStream: " + e2, new Object[0]);
                        }
                    }
                    throw th;
                }
            } catch (NullPointerException unused) {
                Log.d("Unable to read file while uploading " + str, new Object[0]);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e3) {
                        Log.d("Failed to close InputStream: " + e3, new Object[0]);
                    }
                }
                return false;
            }
        }
    }

    private void writeFileEnd(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeBytes(LINE_END);
    }

    private void writeFileHeader(DataOutputStream dataOutputStream, String str, int i) throws IOException {
        dataOutputStream.writeBytes("--==================================leanplum\r\n" + String.format(Locale.getDefault(), "Content-Disposition: form-data; name=\"%s%d\";filename=\"%s\"", "file", Integer.valueOf(i), str) + "\r\nContent-Type: application/octet-stream\r\n\r\n");
    }

    private void writeHeader(DataOutputStream dataOutputStream, Map<String, Object> map) throws IOException {
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            dataOutputStream.writeBytes("--==================================leanplum\r\nContent-Disposition: form-data; name=\"" + entry.getKey() + "\"\r\n\r\n" + entry.getValue() + LINE_END);
        }
    }

    public boolean uploadFiles(List<File> list, List<InputStream> list2, Map<String, Object> map) throws IOException {
        this.urlConnection.setRequestProperty("Content-Type", "multipart/form-data; boundary===================================leanplum");
        this.urlConnection.setRequestProperty("Connection", "Keep-Alive");
        DataOutputStream dataOutputStream = new DataOutputStream(this.urlConnection.getOutputStream());
        writeHeader(dataOutputStream, map);
        int i = 0;
        while (i < list.size()) {
            File file = list.get(i);
            UploadOperation uploadOperation = this;
            if (!uploadOperation.writeFile(dataOutputStream, file.getName(), file.getPath(), i < list2.size() ? list2.get(i) : new FileInputStream(file), i)) {
                return false;
            }
            i++;
            this = uploadOperation;
        }
        this.writeEnd(dataOutputStream);
        dataOutputStream.flush();
        dataOutputStream.close();
        return true;
    }
}
