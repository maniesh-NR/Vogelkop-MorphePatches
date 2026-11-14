package defpackage;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.y;
import com.leanplum.utils.SizeUtil;
import java.util.ArrayList;
import org.chromium.base.IAndroidInfo;
import org.chromium.base.IApkInfo;
import org.chromium.base.IDeviceInfo;
import org.chromium.base.library_loader.IRelroLibInfo;
import org.chromium.base.process_launcher.IChildProcessArgs;
import org.chromium.base.process_launcher.IFileDescriptorInfo;

/* loaded from: classes.dex */
public final class uz8 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    public /* synthetic */ uz8(byte b) {
        this.a = b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0092, code lost:
    
        if (r0 <= (Integer.MAX_VALUE - r1)) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object a(android.os.Parcel r8) {
        /*
            r7 = this;
            org.chromium.base.library_loader.IRelroLibInfo r7 = new org.chromium.base.library_loader.IRelroLibInfo
            r7.<init>()
            r0 = 0
            r7.b = r0
            r7.c = r0
            r7.d = r0
            r7.e = r0
            int r0 = r8.dataPosition()
            int r1 = r8.readInt()
            r2 = 4
            r3 = 0
            r4 = 2147483647(0x7fffffff, float:NaN)
            if (r1 < r2) goto L99
            int r2 = r8.dataPosition()     // Catch: java.lang.Throwable -> La1
            int r2 = r2 - r0
            if (r2 < r1) goto L2a
            int r4 = r4 - r1
            if (r0 > r4) goto La5
            goto L94
        L2a:
            java.lang.String r2 = r8.readString()     // Catch: java.lang.Throwable -> La1
            r7.a = r2     // Catch: java.lang.Throwable -> La1
            int r2 = r8.dataPosition()     // Catch: java.lang.Throwable -> La1
            int r2 = r2 - r0
            if (r2 < r1) goto L3b
            int r4 = r4 - r1
            if (r0 > r4) goto La5
            goto L94
        L3b:
            long r5 = r8.readLong()     // Catch: java.lang.Throwable -> La1
            r7.b = r5     // Catch: java.lang.Throwable -> La1
            int r2 = r8.dataPosition()     // Catch: java.lang.Throwable -> La1
            int r2 = r2 - r0
            if (r2 < r1) goto L4c
            int r4 = r4 - r1
            if (r0 > r4) goto La5
            goto L94
        L4c:
            long r5 = r8.readLong()     // Catch: java.lang.Throwable -> La1
            r7.c = r5     // Catch: java.lang.Throwable -> La1
            int r2 = r8.dataPosition()     // Catch: java.lang.Throwable -> La1
            int r2 = r2 - r0
            if (r2 < r1) goto L5d
            int r4 = r4 - r1
            if (r0 > r4) goto La5
            goto L94
        L5d:
            long r5 = r8.readLong()     // Catch: java.lang.Throwable -> La1
            r7.d = r5     // Catch: java.lang.Throwable -> La1
            int r2 = r8.dataPosition()     // Catch: java.lang.Throwable -> La1
            int r2 = r2 - r0
            if (r2 < r1) goto L6e
            int r4 = r4 - r1
            if (r0 > r4) goto La5
            goto L94
        L6e:
            long r5 = r8.readLong()     // Catch: java.lang.Throwable -> La1
            r7.e = r5     // Catch: java.lang.Throwable -> La1
            int r2 = r8.dataPosition()     // Catch: java.lang.Throwable -> La1
            int r2 = r2 - r0
            if (r2 < r1) goto L7f
            int r4 = r4 - r1
            if (r0 > r4) goto La5
            goto L94
        L7f:
            android.os.Parcelable$Creator r2 = android.os.ParcelFileDescriptor.CREATOR     // Catch: java.lang.Throwable -> La1
            int r5 = r8.readInt()     // Catch: java.lang.Throwable -> La1
            if (r5 == 0) goto L8c
            java.lang.Object r2 = r2.createFromParcel(r8)     // Catch: java.lang.Throwable -> La1
            goto L8d
        L8c:
            r2 = r3
        L8d:
            android.os.ParcelFileDescriptor r2 = (android.os.ParcelFileDescriptor) r2     // Catch: java.lang.Throwable -> La1
            r7.f = r2     // Catch: java.lang.Throwable -> La1
            int r4 = r4 - r1
            if (r0 > r4) goto La5
        L94:
            int r0 = r0 + r1
            r8.setDataPosition(r0)
            return r7
        L99:
            android.os.BadParcelableException r7 = new android.os.BadParcelableException     // Catch: java.lang.Throwable -> La1
            java.lang.String r2 = "Parcelable too small"
            r7.<init>(r2)     // Catch: java.lang.Throwable -> La1
            throw r7     // Catch: java.lang.Throwable -> La1
        La1:
            r7 = move-exception
            int r4 = r4 - r1
            if (r0 <= r4) goto La9
        La5:
            s49.c()
            return r3
        La9:
            int r0 = r0 + r1
            r8.setDataPosition(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uz8.a(android.os.Parcel):java.lang.Object");
    }

    private final Object b(Parcel parcel) {
        fya ok3Var;
        long j = parcel.readLong();
        int iOrdinal = ((eya) eya.h.get(parcel.readInt())).ordinal();
        if (iOrdinal == 0) {
            ArrayList arrayList = new ArrayList();
            parcel.readTypedList(arrayList, PointF.CREATOR);
            ok3Var = new ok3(arrayList);
        } else if (iOrdinal == 1) {
            ArrayList arrayList2 = new ArrayList();
            parcel.readTypedList(arrayList2, PointF.CREATOR);
            ok3Var = new v6g(arrayList2, parcel.readInt());
        } else if (iOrdinal == 2) {
            ok3Var = new oel(parcel.readString(), (PointF) kfo.b0(parcel, oel.class.getClassLoader(), PointF.class), parcel.readFloat(), parcel.readFloat(), parcel.readInt(), parcel.readInt() != 0, (PointF) kfo.b0(parcel, PointF.class.getClassLoader(), PointF.class), parcel.readInt(), parcel.readInt() != 0, (nil) nil.e.get(parcel.readInt()), parcel.readInt() != 0, parcel.readInt());
        } else if (iOrdinal == 3) {
            ok3Var = new ox7(parcel.readString(), (PointF) kfo.b0(parcel, oel.class.getClassLoader(), PointF.class), parcel.readFloat(), parcel.readFloat());
        } else {
            if (iOrdinal != 4) {
                h9o.p();
                return null;
            }
            ArrayList arrayList3 = new ArrayList();
            parcel.readTypedList(arrayList3, PointF.CREATOR);
            ok3Var = new f76(arrayList3, parcel.readInt());
        }
        ok3Var.b = j;
        return ok3Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:142:0x01c0, code lost:
    
        if (r1 <= (Integer.MAX_VALUE - r2)) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x02e5, code lost:
    
        if (r1 <= (Integer.MAX_VALUE - r2)) goto L232;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x03d9, code lost:
    
        if (r1 <= (Integer.MAX_VALUE - r2)) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x0534, code lost:
    
        if (r1 <= (Integer.MAX_VALUE - r2)) goto L412;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ec, code lost:
    
        if (r1 <= (Integer.MAX_VALUE - r2)) goto L65;
     */
    /* JADX WARN: Type inference failed for: r12v14, types: [a89, android.view.ViewGroup$MarginLayoutParams, java.lang.Object, lph] */
    @Override // android.os.Parcelable.Creator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object createFromParcel(android.os.Parcel r13) {
        /*
            Method dump skipped, instructions count: 1996
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uz8.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new vz8[i];
            case 1:
                return new p09[i];
            case 2:
                return new s09[i];
            case 3:
                return new t09[i];
            case 4:
                return new u09[i];
            case 5:
                return new v09[i];
            case 6:
                return new w09[i];
            case 7:
                return new b29[i];
            case 8:
                return new y79[i];
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                return new a89[i];
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                return new c89[i];
            case 11:
                return new yl9[i];
            case 12:
                return new em9[i];
            case 13:
                return new y[i];
            case 14:
                return new dw9[i];
            case 15:
                return new baa[i];
            case 16:
                return new oba[i];
            case 17:
                return new xba[i];
            case SizeUtil.textSize0_1 /* 18 */:
                return new tca[i];
            case 19:
                return new IAndroidInfo[i];
            case SizeUtil.textSize0 /* 20 */:
                return new IApkInfo[i];
            case 21:
                return new IChildProcessArgs[i];
            case SizeUtil.textSize1 /* 22 */:
                return new IDeviceInfo[i];
            case 23:
                return new IFileDescriptorInfo[i];
            case SizeUtil.textSize2 /* 24 */:
                return new IRelroLibInfo[i];
            case 25:
                return new bxa[i];
            case 26:
                return new fya[i];
            case 27:
                return new m2b[i];
            case 28:
                return new d3b[i];
            default:
                return new hdb[i];
        }
    }
}
