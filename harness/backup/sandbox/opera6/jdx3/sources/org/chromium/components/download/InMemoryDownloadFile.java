package org.chromium.components.download;

import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: classes.dex */
public final class InMemoryDownloadFile {
    public FileOutputStream a;
    public final ParcelFileDescriptor b;

    public InMemoryDownloadFile(String str) throws ErrnoException {
        FileDescriptor fileDescriptorMemfd_create = Os.memfd_create(str, 0);
        this.b = ParcelFileDescriptor.dup(fileDescriptorMemfd_create);
        this.a = new FileOutputStream(fileDescriptorMemfd_create);
    }

    public static InMemoryDownloadFile createFile(String str) {
        try {
            return new InMemoryDownloadFile(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public final void destroy() throws IOException {
        try {
            FileOutputStream fileOutputStream = this.a;
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
            ParcelFileDescriptor parcelFileDescriptor = this.b;
            if (parcelFileDescriptor != null) {
                parcelFileDescriptor.close();
            }
        } catch (IOException unused) {
        }
    }

    public final void finish() throws IOException {
        try {
            FileOutputStream fileOutputStream = this.a;
            if (fileOutputStream != null) {
                fileOutputStream.close();
                this.a = null;
            }
            ParcelFileDescriptor parcelFileDescriptor = this.b;
            if (parcelFileDescriptor != null) {
                parcelFileDescriptor.detachFd();
            }
        } catch (Exception unused) {
        }
    }

    public final int getFd() {
        ParcelFileDescriptor parcelFileDescriptor = this.b;
        if (parcelFileDescriptor != null) {
            return parcelFileDescriptor.getFd();
        }
        return 0;
    }

    public final void writeData(byte[] bArr) throws IOException {
        try {
            this.a.write(bArr);
        } catch (Exception unused) {
        }
    }
}
