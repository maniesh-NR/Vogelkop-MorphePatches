package defpackage;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import android.util.Size;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class x12 {
    public final ContentResolver a;
    public final ii b;

    public x12(ContentResolver contentResolver, ii iiVar) {
        this.a = contentResolver;
        this.b = iiVar;
    }

    public static t12 a(InputStream inputStream, int i, File file) {
        Size size;
        Bitmap bitmapCreateBitmap;
        t12 t12Var;
        Bitmap bitmapCreateScaledBitmap;
        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStream);
        if (bitmapDecodeStream == null) {
            return t12.b;
        }
        Size size2 = new Size(bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight());
        Size size3 = size2.getWidth() >= size2.getHeight() ? new Size(2000, 768) : new Size(768, 2000);
        if (size2.getWidth() > size3.getWidth() || size2.getHeight() > size3.getHeight()) {
            double dMax = Math.max(size2.getWidth() / size3.getWidth(), size2.getHeight() / size3.getHeight());
            size = new Size((int) (size2.getWidth() / dMax), (int) (size2.getHeight() / dMax));
        } else {
            size = size2;
        }
        if (!size2.equals(size)) {
            try {
                Bitmap bitmapCreateScaledBitmap2 = Bitmap.createScaledBitmap(bitmapDecodeStream, size.getWidth(), size.getHeight(), true);
                bitmapDecodeStream.recycle();
                bitmapDecodeStream = bitmapCreateScaledBitmap2;
            } catch (Throwable unused) {
                bitmapDecodeStream.recycle();
                bitmapDecodeStream = null;
            }
            if (bitmapDecodeStream == null) {
                return t12.d;
            }
        }
        Bitmap bitmap = bitmapDecodeStream;
        Matrix matrix = new Matrix();
        switch (i) {
            case 2:
                matrix.setScale(-1.0f, 1.0f);
                try {
                    bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
                    break;
                } catch (OutOfMemoryError unused2) {
                    break;
                }
            case 3:
                matrix.setRotate(180.0f);
                bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
                break;
            case 4:
                matrix.setRotate(180.0f);
                matrix.postScale(-1.0f, 1.0f);
                bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
                break;
            case 5:
                matrix.setRotate(90.0f);
                matrix.postScale(-1.0f, 1.0f);
                bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
                break;
            case 6:
                matrix.setRotate(90.0f);
                bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
                break;
            case 7:
                matrix.setRotate(-90.0f);
                matrix.postScale(-1.0f, 1.0f);
                bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
                break;
            case 8:
                matrix.setRotate(-90.0f);
                bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
                break;
            default:
                bitmapCreateBitmap = bitmap;
                break;
        }
        if (bitmapCreateBitmap != bitmap) {
            bitmap.recycle();
        }
        while (true) {
            try {
                if (!z5i.l0(bitmapCreateBitmap, file, r9n.z(), 90)) {
                    t12Var = t12.c;
                } else if (file.length() <= 4000000) {
                    t12Var = t12.a;
                } else {
                    Size size4 = new Size(Math.round(bitmapCreateBitmap.getWidth() * 0.8660254f), Math.round(bitmapCreateBitmap.getHeight() * 0.8660254f));
                    try {
                        bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateBitmap, size4.getWidth(), size4.getHeight(), true);
                        bitmapCreateBitmap.recycle();
                    } catch (Throwable unused3) {
                        bitmapCreateBitmap.recycle();
                        bitmapCreateScaledBitmap = null;
                    }
                    if (bitmapCreateScaledBitmap == null) {
                        t12Var = t12.d;
                    } else {
                        bitmapCreateBitmap.recycle();
                        bitmapCreateBitmap = bitmapCreateScaledBitmap;
                    }
                }
            } finally {
                bitmapCreateBitmap.recycle();
            }
        }
        return t12Var;
    }

    public static t12 b(File file, File file2) throws IOException {
        if (!file.exists()) {
            qp2.n("Check failed.");
            return null;
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        int iD = 1;
        try {
            iD = new gh8(fileInputStream).d(1, "Orientation");
        } catch (Throwable unused) {
        }
        fileInputStream.close();
        FileInputStream fileInputStream2 = new FileInputStream(file);
        try {
            t12 t12VarA = a(fileInputStream2, iD, file2);
            fileInputStream2.close();
            return t12VarA;
        } finally {
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: oye */
    public final t12 c(o0g o0gVar) throws oye {
        try {
            char c = o0gVar instanceof v12 ? (char) 0 : o0gVar instanceof u12 ? (char) 1 : o0gVar instanceof w12 ? (char) 2 : (char) 65534;
            if (c == 0) {
                return d(((v12) o0gVar).i, ((v12) o0gVar).j);
            }
            if (c == 1) {
                return b(((u12) o0gVar).i, ((u12) o0gVar).j);
            }
            if (c == 2) {
                return e(((w12) o0gVar).i, ((w12) o0gVar).j);
            }
            throw new oye();
        } catch (Exception unused) {
            return t12.d;
        }
    }

    public final t12 d(Uri uri, File file) throws IOException {
        ContentResolver contentResolver = this.a;
        if (!z4o.P(file)) {
            qp2.n("Check failed.");
            return null;
        }
        if (s29.g(uri)) {
            String path = uri.getPath();
            if (path == null) {
                path = "";
            }
            return b(new File(path), file);
        }
        try {
            InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
            if (inputStreamOpenInputStream != null) {
                int iD = 1;
                try {
                    iD = new gh8(inputStreamOpenInputStream).d(1, "Orientation");
                } catch (Throwable unused) {
                }
                inputStreamOpenInputStream.close();
                try {
                    inputStreamOpenInputStream = contentResolver.openInputStream(uri);
                    try {
                        if (inputStreamOpenInputStream == null) {
                            t12 t12Var = t12.c;
                            vtp.v(inputStreamOpenInputStream, (Throwable) null);
                            return t12Var;
                        }
                        t12 t12VarA = a(inputStreamOpenInputStream, iD, file);
                        inputStreamOpenInputStream.close();
                        return t12VarA;
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                } catch (IOException unused2) {
                    return t12.c;
                }
            }
            try {
                t12 t12Var2 = t12.c;
                vtp.v(inputStreamOpenInputStream, (Throwable) null);
                return t12Var2;
            } finally {
            }
        } catch (IOException unused3) {
            return t12.c;
        }
    }

    public final t12 e(Uri uri, File file) {
        if (!z4o.P(file)) {
            qp2.n("Check failed.");
            return null;
        }
        t9f t9fVar = (t9f) this.b.get();
        fvh fvhVar = new fvh();
        fvhVar.h(uri.toString());
        return (t12) vtp.R(t9fVar.c(new kvh(fvhVar)), new wx1(uri, this, file), new k51((byte) 29), 0, 0L, 120);
    }
}
