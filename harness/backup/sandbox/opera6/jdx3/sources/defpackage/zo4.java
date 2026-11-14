package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.MediaSeekOptions;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.MediaTrack;
import com.google.android.gms.cast.framework.CastContext;
import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.cast.framework.SessionManager;
import com.google.android.gms.cast.framework.media.MediaQueue;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.common.api.PendingResult;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class zo4 extends g83 {
    public static final jyl O = new jyl(null, null, null);
    public static final long[] P = new long[0];
    public static final kuh[] Q = {new n9a((byte) 28), new y55(), new qs7((byte) 28)};
    public static final cig R;
    public float A;
    public float B;
    public boolean C;
    public boolean D;
    public long E;
    public qjd F;
    public jyl G;
    public fyl H;
    public fzl I;
    public cig J;
    public boolean K;
    public boolean L;
    public boolean M;
    public jij N;
    public final wth c;
    public final to4 d;
    public final uo4 e;
    public final vo4 f;
    public final xmf g;
    public final jx6 h;
    public final Handler i;
    public final ijc j;
    public final ArrayList k;
    public int[] l;
    public final SparseArray m;
    public final ArrayDeque n;
    public final short o;
    public final short p;
    public wo4 q;
    public int r;
    public long s;
    public rb3 t;
    public SessionManager u;
    public RemoteMediaClient v;
    public byte w;
    public zh8 x;
    public int y;
    public float z;

    static {
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        for (int i : new int[]{1, 2, 3, 4, 10, 15, 13, 16, 17, 18, 20, 30}) {
            z4o.H(!false);
            sparseBooleanArray.append(i, true);
        }
        z4o.H(!false);
        R = new cig(new w69(sparseBooleanArray));
    }

    public zo4(Context context, CastContext castContext, xmf xmfVar, jx6 jx6Var) {
        wth wthVar = new wth((Object) this, (byte) 23);
        this.c = wthVar;
        this.d = new to4(this);
        this.e = new uo4(this);
        this.f = new vo4(this);
        ArrayList arrayList = new ArrayList();
        this.k = arrayList;
        this.l = new int[0];
        this.m = new SparseArray();
        this.n = new ArrayDeque();
        this.t = rb3.g;
        this.w = (byte) 1;
        this.y = 0;
        this.z = 1.0f;
        this.A = 1.0f;
        this.B = 1.0f;
        this.E = -9223372036854775807L;
        this.G = O;
        this.H = fyl.d;
        this.I = fzl.b;
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        w69 w69Var = R.a;
        for (int i = 0; i < w69Var.a.size(); i++) {
            int iB = w69Var.b(i);
            z4o.H(!false);
            sparseBooleanArray.append(iB, true);
        }
        z4o.H(!false);
        this.J = new cig(new w69(sparseBooleanArray));
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper = looperMyLooper == null ? this.i.getLooper() : looperMyLooper;
        this.i = new Handler(looperMyLooper);
        this.j = new ijc(looperMyLooper, new t14(this));
        this.N = new hij(arrayList.size());
        this.u = castContext.getSessionManager();
        this.g = xmfVar;
        this.h = jx6Var;
        Context applicationContext = context == null ? null : context.getApplicationContext();
        HashMap map = new HashMap(8);
        map.put(0, 1000000L);
        map.put(2, -9223372036854775807L);
        map.put(3, -9223372036854775807L);
        map.put(4, -9223372036854775807L);
        map.put(5, -9223372036854775807L);
        map.put(10, -9223372036854775807L);
        map.put(9, -9223372036854775807L);
        map.put(7, -9223372036854775807L);
        pl6 pl6Var = new pl6(applicationContext, map);
        ko4 ko4Var = new ko4(this);
        z4o.H(jx6Var.a == null);
        jx6Var.a = ko4Var;
        jx6Var.b = pl6Var;
        this.o = (short) 10000;
        this.p = (short) 30000;
        this.u.addSessionManagerListener(wthVar, CastSession.class);
        CastSession currentCastSession = this.u.getCurrentCastSession();
        if (currentCastSession != null) {
            G0(currentCastSession.getRemoteMediaClient());
        }
    }

    public static int[] A0(int i, int i2) {
        int i3 = i2 - i;
        int[] iArr = new int[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            iArr[i4] = i + i4;
        }
        return iArr;
    }

    public static int[] B0(int i, int i2, jij jijVar) {
        int firstIndex = jijVar.getFirstIndex();
        int i3 = i2 - i;
        int[] iArr = new int[i3];
        int i4 = 0;
        int i5 = 0;
        while (i4 < i3) {
            if (i5 >= jijVar.getLength()) {
                return Arrays.copyOf(iArr, i4);
            }
            if (firstIndex >= i && firstIndex < i2) {
                iArr[i4] = firstIndex;
                i4++;
            }
            firstIndex = jijVar.getNextIndex(firstIndex);
            i5++;
        }
        return iArr;
    }

    public final void A(pf2 pf2Var, boolean z) {
    }

    public final void B(vjd vjdVar) {
    }

    public final void C0(MediaError mediaError) {
        zh8 zh8VarH;
        String reason = mediaError.getReason();
        String[] strArr = aik.a;
        if (reason == null) {
            reason = "";
        }
        Integer detailedErrorCode = mediaError.getDetailedErrorCode();
        if (detailedErrorCode != null) {
            int iIntValue = detailedErrorCode.intValue();
            zh8VarH = (iIntValue == 102 || iIntValue == 104) ? new zh8(0, new IOException(reason), 4003) : zh8.h(1000, new RuntimeException(reason));
        } else {
            zh8VarH = zh8.h(1000, new RuntimeException(reason));
        }
        this.x = zh8VarH;
        this.j.d(10, new jl4((Object) zh8VarH, (byte) 1));
        stop();
    }

    public final void D(boolean z) {
    }

    public final void D0(int i, xo4 xo4Var) {
        RemoteMediaClient remoteMediaClient = this.v;
        if (remoteMediaClient == null) {
            return;
        }
        if (this.q == null) {
            PendingResult pendingResultM = xo4Var.m(remoteMediaClient);
            if (pendingResultM == null) {
                return;
            }
            this.q = new wo4(i, pendingResultM);
            pendingResultM.setResultCallback(new po4(this));
            return;
        }
        ArrayDeque arrayDeque = this.n;
        if (i != 1 && i != 2 && i != 3 && i != 4) {
            switch (i) {
                case 31:
                case 32:
                case 33:
                    break;
                default:
                    Iterator it = arrayDeque.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else if (((yo4) it.next()).a == i) {
                            it.remove();
                            break;
                        }
                    }
            }
        }
        arrayDeque.addLast(new yo4(i, xo4Var));
    }

    public final void E0(int[] iArr, int[] iArr2) {
        int iMin;
        if (Arrays.equals(iArr, iArr2) || this.v == null || (iMin = Math.min(iArr.length, iArr2.length)) == 0) {
            return;
        }
        D0(4, new qo4(this, iMin, iArr, iArr2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void F0(int i, boolean z) {
        if (this.w != i) {
            this.w = i;
            if (i != 1 && z) {
                this.x = null;
            }
            ho4 ho4Var = new ho4(i);
            ijc ijcVar = this.j;
            ijcVar.d(4, ho4Var);
            boolean zE0 = e0();
            if (this.D != zE0) {
                this.D = zE0;
                ijcVar.d(7, new go4((byte) 2, zE0));
            }
            if (z) {
                return;
            }
            I0();
        }
    }

    public final int G() {
        return 0;
    }

    public final void G0(RemoteMediaClient remoteMediaClient) {
        RemoteMediaClient remoteMediaClient2 = this.v;
        if (remoteMediaClient2 == remoteMediaClient) {
            return;
        }
        vo4 vo4Var = this.f;
        to4 to4Var = this.d;
        uo4 uo4Var = this.e;
        if (remoteMediaClient2 != null) {
            remoteMediaClient2.getMediaQueue().unregisterCallback(uo4Var);
            this.v.unregisterCallback(to4Var);
            this.v.removeProgressListener(vo4Var);
            wo4 wo4Var = this.q;
            if (wo4Var != null) {
                wo4Var.b.cancel();
                this.q = null;
            }
            this.n.clear();
        }
        this.v = remoteMediaClient;
        if (remoteMediaClient == null) {
            stop();
            return;
        }
        remoteMediaClient.registerCallback(to4Var);
        this.v.getMediaQueue().registerCallback(uo4Var);
        this.v.addProgressListener(vo4Var, 500L);
        H0();
        D0(23, new io4(this.A, (byte) 0));
    }

    public final void H0() throws JSONException {
        long j;
        List listAsList;
        byte b;
        if (this.v != null) {
            ArrayList arrayList = this.k;
            if (arrayList.isEmpty()) {
                return;
            }
            MediaQueueItem[] mediaQueueItemArrK0 = K0(arrayList);
            int i = this.y;
            int i2 = i != 1 ? i != 2 ? 0 : 1 : 2;
            float f = this.z;
            boolean z = this.C && ((b = this.w) == 3 || b == 2);
            int length = this.r;
            if (length < mediaQueueItemArrK0.length) {
                j = this.s;
            } else {
                length = mediaQueueItemArrK0.length;
                j = 0;
            }
            if (z) {
                F0(2, true);
            }
            if (this.M) {
                ArrayList arrayList2 = new ArrayList(mediaQueueItemArrK0.length);
                int firstIndex = this.N.getFirstIndex();
                for (int i3 = 0; i3 < mediaQueueItemArrK0.length; i3++) {
                    arrayList2.add(mediaQueueItemArrK0[firstIndex]);
                    firstIndex = this.N.getNextIndex(firstIndex);
                }
                length = arrayList2.indexOf(mediaQueueItemArrK0[length]);
                listAsList = arrayList2;
            } else {
                listAsList = Arrays.asList(mediaQueueItemArrK0);
            }
            D0(3, new ro4(listAsList, i2, length, j, z, f));
            if (z || j <= 0) {
                return;
            }
            MediaSeekOptions.Builder builder = new MediaSeekOptions.Builder();
            builder.setPosition(j);
            builder.setResumeState(0);
            D0(12, new lo4(builder, (byte) 1));
        }
    }

    public final Looper I() {
        return this.i.getLooper();
    }

    public final void I0() {
        byte b = this.w;
        if (b == 1) {
            if (this.k.isEmpty()) {
                D0(32, new t14((byte) 22));
                return;
            } else {
                D0(31, new t14((byte) 23));
                return;
            }
        }
        if (b == 2 || b == 3) {
            if (this.C) {
                D0(33, new t14((byte) 24));
            } else {
                D0(31, new t14((byte) 25));
            }
        }
    }

    public final void J() {
        setVolume(0.0f);
    }

    public final void J0(jyl jylVar, List list) {
        int iB;
        int i = jylVar.a;
        long[] jArr = new long[i];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            bj8 bj8Var = jylVar.b[i3];
            if (bj8Var != null && (iB = this.H.b(bj8Var.getTrackGroup())) != -1) {
                jArr[i2] = ((MediaTrack) list.get(iB)).getId();
                i2++;
            }
        }
        D0(40, new jl4((Object) Arrays.copyOf(jArr, i2), (byte) 5));
    }

    public final void K() {
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.cast.MediaQueueItem[] K0(java.util.List r17) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zo4.K0(java.util.List):com.google.android.gms.cast.MediaQueueItem[]");
    }

    public final nyl L() {
        return nyl.K;
    }

    public final void L0() {
        cig cigVar = this.J;
        cigVar.getClass();
        nrl nrlVar = new nrl((byte) 11);
        nrlVar.c(cigVar.a);
        nrlVar.c(R.a);
        cig cigVar2 = new cig(nrlVar.j());
        this.J = cigVar2;
        if (cigVar2.equals(cigVar)) {
            return;
        }
        this.j.d(13, new ko4(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void M0(com.google.android.gms.cast.MediaStatus r19) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zo4.M0(com.google.android.gms.cast.MediaStatus):void");
    }

    public final int N() {
        return 0;
    }

    public final boolean N0() throws JSONException {
        MediaStatus mediaStatus;
        int i = 0;
        if (!y0(new t14((byte) 26))) {
            ArrayList arrayList = this.k;
            if (arrayList.size() == this.l.length) {
                SparseArray sparseArray = this.m;
                sparseArray.clear();
                if (!this.M) {
                    while (true) {
                        int[] iArr = this.l;
                        if (i >= iArr.length) {
                            break;
                        }
                        sparseArray.put(iArr[i], (qjd) arrayList.get(i));
                        i++;
                    }
                } else {
                    int firstIndex = this.N.getFirstIndex();
                    while (true) {
                        int[] iArr2 = this.l;
                        if (i >= iArr2.length) {
                            break;
                        }
                        sparseArray.put(iArr2[i], (qjd) arrayList.get(firstIndex));
                        firstIndex = this.N.getNextIndex(firstIndex);
                        i++;
                    }
                }
                return true;
            }
            if (this.x == null && (mediaStatus = this.v.getMediaStatus()) != null && mediaStatus.getPlayerState() == 1) {
                F0(1, true);
                this.s = 0L;
                H0();
            }
        }
        return false;
    }

    public final void O0(MediaStatus mediaStatus) {
        if (this.q == null) {
            int playerState = mediaStatus.getPlayerState();
            if (playerState == 1) {
                F0(1, true);
                return;
            }
            if (playerState == 2) {
                F0(3, true);
                return;
            }
            if (playerState == 3) {
                F0(3, true);
            } else if (playerState == 4 || playerState == 5) {
                F0(2, true);
            }
        }
    }

    public final cig P() {
        return this.J;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0058 A[PHI: r14
      0x0058: PHI (r14v6 java.lang.String) = 
      (r14v1 java.lang.String)
      (r14v1 java.lang.String)
      (r14v4 java.lang.String)
      (r14v1 java.lang.String)
      (r14v13 java.lang.String)
      (r14v14 java.lang.String)
      (r14v1 java.lang.String)
      (r14v1 java.lang.String)
      (r14v15 java.lang.String)
      (r14v16 java.lang.String)
     binds: [B:38:0x0081, B:40:0x0087, B:50:0x00a6, B:34:0x0074, B:36:0x007a, B:32:0x006d, B:22:0x0052, B:27:0x005e, B:29:0x0064, B:24:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P0(com.google.android.gms.cast.MediaStatus r21) {
        /*
            Method dump skipped, instructions count: 475
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zo4.P0(com.google.android.gms.cast.MediaStatus):void");
    }

    public final void Q0(boolean z) {
        rb3 rb3Var;
        long j;
        boolean zA;
        SparseArray sparseArray;
        int iIndexOfValue;
        int iIndexOfItemWithId;
        MediaQueueItem itemAtIndex;
        ArrayList arrayList = this.k;
        byte b = 2;
        if (!arrayList.isEmpty()) {
            jij jijVar = this.N;
            ArrayList arrayList2 = new ArrayList();
            fql fqlVar = new fql();
            RemoteMediaClient remoteMediaClient = this.v;
            MediaQueue mediaQueue = remoteMediaClient != null ? remoteMediaClient.getMediaQueue() : null;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                qjd qjdVar = (qjd) obj;
                int i2 = 0;
                while (true) {
                    rb3 rb3Var2 = this.t;
                    if (i2 >= rb3Var2.f.length) {
                        j = -9223372036854775807L;
                        zA = false;
                        break;
                    }
                    rb3Var2.n(i2, fqlVar);
                    if (fqlVar.b == qjdVar) {
                        j = fqlVar.l;
                        zA = fqlVar.a();
                        break;
                    }
                    i2++;
                }
                if (j == -9223372036854775807L && !zA && mediaQueue != null && (iIndexOfValue = (sparseArray = this.m).indexOfValue(qjdVar)) != -1 && (iIndexOfItemWithId = mediaQueue.indexOfItemWithId(sparseArray.keyAt(iIndexOfValue))) != -1 && (itemAtIndex = mediaQueue.getItemAtIndex(iIndexOfItemWithId)) != null) {
                    MediaInfo media = itemAtIndex.getMedia();
                    long streamDuration = media.getStreamDuration();
                    if (streamDuration != -1 && streamDuration >= 0) {
                        j = 1000 * streamDuration;
                    }
                    zA = media.getStreamType() == 2;
                }
                arrayList2.add(new qb3(qjdVar, j, zA));
            }
            rb3Var = new rb3((qb3[]) arrayList2.toArray(new qb3[0]), jijVar);
            if (rb3Var.equals(this.t)) {
                return;
            }
        } else if (this.t.p()) {
            return;
        } else {
            rb3Var = rb3.g;
        }
        this.t = rb3Var;
        this.j.d(0, new vw(b, rb3Var, z));
    }

    public final long R() {
        return 3000L;
    }

    public final void S(eig eigVar) {
        this.j.a(eigVar);
    }

    public final r4n U() {
        return r4n.d;
    }

    public final float V() {
        return this.A;
    }

    public final pf2 W() {
        return pf2.i;
    }

    public final u67 X() {
        return u67.e;
    }

    public final void Y(int i, int i2) {
    }

    public final void a() {
        byte b = this.w;
        if (b == 1 || b == 4) {
            F0(3, false);
        }
        this.j.c();
    }

    public final long a0() {
        return this.p;
    }

    public final void b0(int i, List list) throws JSONException {
        ArrayList arrayList = this.k;
        boolean zIsEmpty = arrayList.isEmpty();
        arrayList.addAll(i, list);
        jij jijVar = this.N;
        this.N = jijVar.cloneAndInsert(i, list.size());
        byte b = 0;
        if (zIsEmpty) {
            H0();
        } else {
            int size = list.size();
            if (size > 0 && this.v != null) {
                MediaQueueItem[] mediaQueueItemArrK0 = K0(arrayList.subList(i, i + size));
                if (!this.M) {
                    D0(1, new so4(this, i, mediaQueueItemArrK0, b));
                } else if (size == 1) {
                    D0(1, new a32((Object) this, (Object) B0(i, i + 1, this.N), (Object) mediaQueueItemArrK0, (byte) 3));
                } else {
                    int[] iArrB0 = B0(0, arrayList.size() - size, jijVar);
                    int[] iArrB02 = B0(0, arrayList.size(), this.N);
                    int[] iArr = new int[iArrB0.length + size];
                    System.arraycopy(iArrB0, 0, iArr, 0, iArrB0.length);
                    for (int i2 = 0; i2 < size; i2++) {
                        iArr[iArrB0.length + i2] = iArrB0.length + i2;
                    }
                    D0(1, new jl4((Object) mediaQueueItemArrK0, (byte) 6));
                    E0(iArr, iArrB02);
                }
            }
        }
        Q0(false);
        this.j.c();
    }

    public final void c(thg thgVar) {
        float fS = cs5.s(thgVar.a, 0.5f, 2.0f);
        if (this.z == fS) {
            return;
        }
        this.z = fS;
        D0(22, new io4(fS, (byte) 1));
    }

    public final void clearVideoSurfaceView(SurfaceView surfaceView) {
    }

    public final void clearVideoTextureView(TextureView textureView) {
    }

    public final long d() {
        return 0L;
    }

    public final vjd d0() {
        return vjd.K;
    }

    public final int f0() {
        return this.r;
    }

    public final void g0(eig eigVar) {
        this.j.f(eigVar);
    }

    public final long getBufferedPosition() {
        return this.s;
    }

    public final long getContentPosition() {
        return this.s;
    }

    public final int getCurrentAdGroupIndex() {
        return -1;
    }

    public final int getCurrentAdIndexInAdGroup() {
        return -1;
    }

    public final int getCurrentPeriodIndex() {
        return this.r;
    }

    public final long getCurrentPosition() {
        return this.s;
    }

    public final gql getCurrentTimeline() {
        return this.t;
    }

    public final long getDuration() {
        long j = this.E;
        return j != -9223372036854775807L ? j : T();
    }

    public final boolean getPlayWhenReady() {
        return this.C;
    }

    public final thg getPlaybackParameters() {
        return this.z == 1.0f ? thg.d : new thg(this.z);
    }

    public final int getPlaybackState() {
        return this.w;
    }

    public final int getRepeatMode() {
        return this.y;
    }

    public final boolean getShuffleModeEnabled() {
        return this.M;
    }

    public final void i(int i, boolean z) {
    }

    public final void i0(int i, int i2, int i3) {
        int i4 = this.r;
        ArrayList arrayList = this.k;
        qjd qjdVar = i4 < arrayList.size() ? (qjd) arrayList.get(this.r) : null;
        List listSubList = arrayList.subList(i, i2);
        ArrayList arrayList2 = new ArrayList(listSubList);
        listSubList.clear();
        if (i3 > arrayList.size()) {
            arrayList.addAll(arrayList2);
        } else {
            arrayList.addAll(i3, arrayList2);
        }
        if (qjdVar != null) {
            this.r = arrayList.indexOf(qjdVar);
        }
        if (i < i2) {
            D0(4, new jo4(i, i2, i3, this));
        }
        Q0(false);
        this.j.c();
    }

    public final boolean isLoading() {
        RemoteMediaClient remoteMediaClient = this.v;
        return remoteMediaClient != null && remoteMediaClient.isBuffering();
    }

    public final boolean isPlayingAd() {
        return false;
    }

    public final void j() {
    }

    public final void k(int i) {
    }

    public final boolean k0() {
        return false;
    }

    public final void l(int i, int i2, List list) throws JSONException {
        q(i, i2);
        b0(i, list);
    }

    public final void m(nyl nylVar) {
    }

    public final long m0() {
        return this.s;
    }

    public final void n0(int i) {
    }

    public final void q(int i, int i2) {
        ArrayList arrayList = this.k;
        int iMin = Math.min(arrayList.size(), i2);
        if (i >= iMin) {
            return;
        }
        qjd qjdVar = this.r < arrayList.size() ? (qjd) arrayList.get(this.r) : null;
        List<qjd> listSubList = arrayList.subList(i, iMin);
        for (qjd qjdVar2 : listSubList) {
            SparseArray sparseArray = this.m;
            int iIndexOfValue = sparseArray.indexOfValue(qjdVar2);
            if (iIndexOfValue != -1) {
                sparseArray.removeAt(iIndexOfValue);
            }
        }
        listSubList.clear();
        if (qjdVar != null) {
            int iIndexOf = arrayList.indexOf(qjdVar);
            if (iIndexOf != -1) {
                this.r = iIndexOf;
            } else if (i < arrayList.size()) {
                this.r = i;
                this.s = 0L;
            } else {
                this.r = Math.max(0, arrayList.size() - 1);
                this.s = 0L;
            }
        }
        if (i < iMin) {
            if (arrayList.isEmpty()) {
                D0(32, new t14((byte) 21));
            } else {
                D0(2, new xj(this, this.M ? B0(i, iMin, this.N) : A0(i, iMin), (byte) 27));
            }
        }
        this.N = this.N.a(i, iMin);
        Q0(false);
        this.j.c();
    }

    public final vjd q0() {
        qjd qjdVar = this.F;
        return qjdVar == null ? vjd.K : qjdVar.e;
    }

    public final void r0(List list) throws JSONException {
        ArrayList arrayList = this.k;
        arrayList.clear();
        this.m.clear();
        arrayList.addAll(list);
        jij jijVarCloneAndInsert = this.N.cloneAndClear().cloneAndInsert(0, arrayList.size());
        this.N = jijVarCloneAndInsert;
        int firstIndex = this.M ? jijVarCloneAndInsert.getFirstIndex() : 0;
        this.r = firstIndex;
        if (firstIndex == -1) {
            this.r = 0;
        }
        this.s = 0L;
        this.E = -9223372036854775807L;
        H0();
        Q0(false);
        this.j.c();
    }

    public final void release() {
        G0(null);
        SessionManager sessionManager = this.u;
        if (sessionManager != null) {
            sessionManager.removeSessionManagerListener(this.c, CastSession.class);
            this.u = null;
        }
    }

    public final rhg s() {
        if (this.w != 1) {
            return null;
        }
        return this.x;
    }

    public final long s0() {
        return this.o;
    }

    public final void setPlayWhenReady(boolean z) {
        if (this.C == z) {
            return;
        }
        this.C = z;
        go4 go4Var = new go4((byte) 1, z);
        ijc ijcVar = this.j;
        ijcVar.d(5, go4Var);
        boolean zE0 = e0();
        if (this.D != zE0) {
            this.D = zE0;
            ijcVar.d(7, new go4((byte) 2, zE0));
        }
        byte b = this.w;
        if (b == 3 || b == 2) {
            I0();
        }
        ijcVar.c();
    }

    public final void setRepeatMode(int i) {
        if (this.y == i) {
            return;
        }
        this.y = i;
        this.j.i(8, new gz3((byte) 1, i));
        int i2 = this.y;
        D0(21, new gz3((byte) 2, i2 != 1 ? i2 != 2 ? 0 : 1 : 2));
    }

    public final void setShuffleModeEnabled(boolean z) {
        int[] iArrB0;
        int[] iArrA0;
        if (this.M != z) {
            this.M = z;
            this.j.i(9, new go4((byte) 0, z));
            ArrayList arrayList = this.k;
            if (arrayList.isEmpty() || this.v == null) {
                return;
            }
            if (this.M) {
                iArrB0 = A0(0, arrayList.size());
                iArrA0 = B0(0, arrayList.size(), this.N);
            } else {
                iArrB0 = B0(0, arrayList.size(), this.N);
                iArrA0 = A0(0, arrayList.size());
            }
            E0(iArrB0, iArrA0);
        }
    }

    public final void setVideoSurfaceHolder(SurfaceHolder surfaceHolder) {
    }

    public final void setVideoSurfaceView(SurfaceView surfaceView) {
    }

    public final void setVideoTextureView(TextureView textureView) {
    }

    public final void setVolume(float f) {
        float fS = cs5.s(f, 0.0f, 1.0f);
        this.A = fS;
        if (fS != 0.0f) {
            this.B = fS;
        }
        D0(23, new io4(fS, (byte) 0));
    }

    public final void stop() {
        F0(1, false);
        this.j.c();
    }

    public final void t() {
        setVolume(this.B);
    }

    public final void v(int i) {
    }

    public final fzl w() {
        return this.I;
    }

    public final void w0(int i, long j, boolean z) {
        fig figVarZ0 = z0();
        int i2 = this.r;
        ijc ijcVar = this.j;
        if (i2 == i) {
            if (j == -9223372036854775807L) {
                j = 0;
            }
            if (this.s == j) {
                return;
            }
            this.s = j;
            MediaSeekOptions.Builder builder = new MediaSeekOptions.Builder();
            builder.setPosition(j);
            builder.setResumeState(0);
            this.K = this.s == 0;
            D0(12, new lo4(builder, (byte) 0));
        } else {
            ArrayList arrayList = this.k;
            if (j == -9223372036854775807L) {
                if (i == -1 || i >= arrayList.size()) {
                    this.r = 0;
                    i = 0;
                } else {
                    this.r = i;
                }
                this.s = 0L;
                this.E = -9223372036854775807L;
                D0(11, new g00(this, i, (byte) 1));
            } else {
                if (i == -1 || i >= arrayList.size()) {
                    this.r = 0;
                    this.s = 0L;
                    i = 0;
                    j = 0;
                } else {
                    this.r = i;
                    this.s = j;
                }
                this.E = -9223372036854775807L;
                D0(11, new oo4(i, j, this));
            }
            qjd qjdVar = this.r < arrayList.size() ? (qjd) arrayList.get(this.r) : null;
            this.F = qjdVar;
            ijcVar.d(1, new mo4(qjdVar, (byte) 0));
        }
        ijcVar.d(11, new no4(figVarZ0, z0(), (byte) 0));
        L0();
        ijcVar.c();
    }

    public final void x(int i, List list, long j) throws JSONException {
        ArrayList arrayList = this.k;
        arrayList.clear();
        this.m.clear();
        arrayList.addAll(list);
        this.N = this.N.cloneAndClear().cloneAndInsert(0, arrayList.size());
        if (i == -1 || i >= arrayList.size()) {
            this.r = this.M ? this.N.getFirstIndex() : 0;
            this.s = 0L;
        } else {
            this.r = i;
            this.s = j;
        }
        this.E = -9223372036854775807L;
        H0();
        Q0(false);
        this.j.c();
    }

    public final boolean y0(t14 t14Var) {
        wo4 wo4Var = this.q;
        if (wo4Var == null) {
            return false;
        }
        if (t14Var.j(wo4Var.a)) {
            return true;
        }
        Iterator it = this.n.iterator();
        while (it.hasNext()) {
            if (t14Var.j(((yo4) it.next()).a)) {
                return true;
            }
        }
        return false;
    }

    public final y36 z() {
        return y36.d;
    }

    public final fig z0() {
        qb3 qb3Var;
        qb3 qb3Var2;
        if (this.t.p()) {
            qb3Var = null;
            qb3Var2 = null;
        } else {
            qb3Var = this.t.f[this.r];
            qb3Var2 = null;
        }
        int i = this.r;
        if (!this.t.p()) {
            qb3Var2 = this.t.f[0];
        }
        qb3 qb3Var3 = qb3Var2;
        long j = this.s;
        return new fig(qb3Var, i, qjd.h, qb3Var3, 0, j, j, -1, -1);
    }
}
