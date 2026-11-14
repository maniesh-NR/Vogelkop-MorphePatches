package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.Image;
import android.os.SystemClock;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_vision_common.zzms;
import com.google.android.gms.internal.mlkit_vision_common.zzmu;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.Closeable;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class r6e implements Closeable, mdc {
    public static final GmsLogger e = new GmsLogger("MobileVisionBase", "");
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final mtp b;
    public final CancellationTokenSource c;
    public final Executor d;

    public r6e(mtp mtpVar, Executor executor) {
        this.b = mtpVar;
        CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        this.c = cancellationTokenSource;
        this.d = executor;
        mtpVar.b.incrementAndGet();
        mtpVar.a(executor, aqp.a, cancellationTokenSource.getToken()).addOnFailureListener(ulp.p);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    @KeepForSdk
    @ucf(occ.ON_DESTROY)
    public synchronized void close() {
        if (!this.a.getAndSet(true)) {
            this.c.cancel();
            mtp mtpVar = this.b;
            Executor executor = this.d;
            Preconditions.checkState(mtpVar.b.get() > 0);
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            mtpVar.a.l(new iqp(mtpVar, taskCompletionSource, (byte) 5), executor);
            taskCompletionSource.getTask();
        }
    }

    public final Task h(Image image, int i, Matrix matrix) {
        int iLimit;
        x8b x8bVar;
        Bitmap bitmapCreateBitmap;
        Preconditions.checkArgument(image.getFormat() == 35, "Only YUV_420_888 is supported now");
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Preconditions.checkNotNull(image, "Please provide a valid image");
        x8b.b(i);
        Preconditions.checkArgument(image.getFormat() == 256 || image.getFormat() == 35, "Only JPEG and YUV_420_888 are supported now");
        Image.Plane[] planes = image.getPlanes();
        byte b = 3;
        if (image.getFormat() == 256) {
            iLimit = image.getPlanes()[0].getBuffer().limit();
            Preconditions.checkArgument(image.getFormat() == 256, "Only JPEG is supported now");
            Image.Plane[] planes2 = image.getPlanes();
            if (planes2 == null || planes2.length != 1) {
                qp2.o("Unexpected image format, JPEG should have exactly 1 image plane");
                return null;
            }
            ByteBuffer buffer = planes2[0].getBuffer();
            buffer.rewind();
            int iRemaining = buffer.remaining();
            byte[] bArr = new byte[iRemaining];
            buffer.get(bArr);
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, iRemaining);
            int width = bitmapDecodeByteArray.getWidth();
            int height = bitmapDecodeByteArray.getHeight();
            if (i == 0) {
                bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, width, height);
            } else {
                Matrix matrix2 = new Matrix();
                matrix2.postRotate(i);
                bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, width, height, matrix2, true);
            }
            x8bVar = new x8b(bitmapCreateBitmap);
        } else {
            for (Image.Plane plane : planes) {
                if (plane.getBuffer() != null) {
                    plane.getBuffer().rewind();
                }
            }
            x8b x8bVar2 = new x8b(image, image.getWidth(), image.getHeight(), i, matrix);
            iLimit = (image.getPlanes()[0].getBuffer().limit() * 3) / 2;
            x8bVar = x8bVar2;
        }
        zzmu.zza(zzms.zzb("vision-common"), image.getFormat(), 5, jElapsedRealtime, image.getHeight(), image.getWidth(), iLimit, i);
        synchronized (this) {
            Preconditions.checkNotNull(x8bVar, "InputImage can not be null");
            if (this.a.get()) {
                return Tasks.forException(new l3e("This detector is already closed!", 14));
            }
            if (x8bVar.c < 32 || x8bVar.d < 32) {
                return Tasks.forException(new l3e("InputImage width and height should be at least 32!", 3));
            }
            return this.b.a(this.d, new sxd(this, x8bVar, b), this.c.getToken());
        }
    }
}
