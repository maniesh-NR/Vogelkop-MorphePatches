package defpackage;

import J.N;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.i;
import com.google.android.gms.tasks.OnSuccessListener;
import com.opera.android.ui.catalog.widget.OperaListItem;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Locale;
import java.util.UUID;
import org.chromium.media.MediaDrmBridge;
import org.chromium.net.UploadDataProvider;

/* loaded from: classes.dex */
public final /* synthetic */ class vw implements yjj, bcf, fjc, vlf, qnb, vid, vqd, op5, i82, OnSuccessListener, dkj {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vw(byte b, Object obj, boolean z) {
        this.a = b;
        this.c = obj;
        this.b = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ vw(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }

    public /* synthetic */ vw(boolean z, p35 p35Var) {
        this.a = (byte) 3;
        this.b = z;
        this.c = p35Var;
    }

    @Override // defpackage.dkj
    public final void a() {
        ((juj) this.c).G0(this.b);
    }

    public final void accept(Object obj) {
        ((xkg) obj).A((pf2) this.c, this.b);
    }

    @Override // defpackage.yjj
    public final i c(ViewGroup viewGroup) {
        return new ww((yw) this.c, vs.e(LayoutInflater.from(viewGroup.getContext()), viewGroup), this.b);
    }

    @Override // defpackage.i82
    public final j82 d(oqe oqeVar) {
        String str = (String) this.c;
        if ((oqeVar instanceof mre) || (oqeVar instanceof dre) || (oqeVar instanceof rre) || (oqeVar instanceof d9i) || oqeVar.getClass().equals(msh.class)) {
            return pue.e(oqeVar, str, this.b);
        }
        return null;
    }

    public final void invoke(Object obj) {
        byte b = this.a;
        boolean z = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 2:
                ((eig) obj).K((rb3) obj2, z ? 1 : 0);
                break;
            default:
                ((eig) obj).K(((shg) obj2).a, z ? 1 : 0);
                break;
        }
    }

    public final Object l(npd npdVar, nod nodVar, int i) {
        byte b = this.a;
        long currentPosition = -9223372036854775807L;
        int iF0 = -1;
        boolean z = this.b;
        Object obj = this.c;
        switch (b) {
            case 8:
                csh cshVarV = h1b.v((qjd) obj);
                if (!z) {
                    iF0 = npdVar.t.f0();
                    currentPosition = npdVar.t.getCurrentPosition();
                }
                return npdVar.p(nodVar, cshVarV, iF0, currentPosition);
            default:
                csh cshVar = (csh) obj;
                if (!z) {
                    iF0 = npdVar.t.f0();
                    currentPosition = npdVar.t.getCurrentPosition();
                }
                return npdVar.p(nodVar, cshVar, iF0, currentPosition);
        }
    }

    public final g3o l0(View view, g3o g3oVar) {
        bt2 bt2Var = (bt2) this.c;
        d3o d3oVar = g3oVar.a;
        int i = d3oVar.i(8).d;
        if (i == 0) {
            bt2Var.b.postDelayed(bt2Var.i, 100L);
        }
        if (this.b) {
            return g3oVar;
        }
        int i2 = d3oVar.i(519).d;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            t3p.q("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = i - i2;
        view.setLayoutParams(marginLayoutParams);
        return g3oVar;
    }

    public final void onSuccess(Object obj) {
        SharedPreferences.Editor editorEdit = z7h.m((Context) this.c).edit();
        editorEdit.putBoolean("proxy_retention", this.b);
        editorEdit.apply();
    }

    public final void run() throws IOException {
        byte b = 1;
        byte b2 = 0;
        switch (this.a) {
            case 5:
                nnb nnbVar = (nnb) this.c;
                boolean z = this.b;
                tom tomVar = nnbVar.d;
                long length = ((UploadDataProvider) tomVar.b).getLength();
                nnbVar.f = length;
                if (length != 0) {
                    if (length <= 0 || length >= 8192) {
                        nnbVar.e = ByteBuffer.allocateDirect(8192);
                    } else {
                        nnbVar.e = ByteBuffer.allocateDirect(((int) length) + 1);
                    }
                    long j = nnbVar.f;
                    HttpURLConnection httpURLConnection = nnbVar.i;
                    if (j > 0) {
                        httpURLConnection.setFixedLengthStreamingMode(j);
                    } else {
                        httpURLConnection.setChunkedStreamingMode(8192);
                    }
                    if (!z) {
                        nnbVar.a.set(1);
                        tomVar.rewind(nnbVar);
                        break;
                    } else {
                        nnbVar.a(new gnb(nnbVar.m, new cnb(nnbVar, b), (byte) 2), "startRead");
                        break;
                    }
                } else {
                    if (nnbVar.k != null && nnbVar.j.compareAndSet(false, true)) {
                        nnbVar.k.close();
                    }
                    pnb pnbVar = nnbVar.m;
                    pnbVar.l = 13;
                    pnbVar.c("fireGetHeaders", new gnb(pnbVar, new hnb(pnbVar, (byte) 0), (byte) 2));
                    break;
                }
                break;
            default:
                fnb fnbVar = (fnb) this.c;
                boolean z2 = this.b;
                fnbVar.e.flip();
                long j2 = fnbVar.f;
                if (j2 != -1 && j2 - fnbVar.g < fnbVar.e.remaining()) {
                    fnbVar.c(new IllegalArgumentException(String.format(Locale.getDefault(), "Read upload data length %d exceeds expected length %d", Long.valueOf(fnbVar.g + fnbVar.e.remaining()), Long.valueOf(fnbVar.f))));
                    break;
                } else if (fnbVar.e.remaining() == 0 && !z2) {
                    fnbVar.c(new IllegalStateException("Bytes read can't be zero except for last chunk!"));
                    break;
                } else {
                    long j3 = fnbVar.g;
                    ByteBuffer byteBuffer = fnbVar.e;
                    nnb nnbVar2 = (nnb) fnbVar;
                    int iWrite = 0;
                    while (byteBuffer.hasRemaining()) {
                        iWrite += nnbVar2.k.write(byteBuffer);
                    }
                    nnbVar2.l.flush();
                    long j4 = j3 + iWrite;
                    fnbVar.g = j4;
                    long j5 = fnbVar.f;
                    if (j4 >= j5) {
                        if (j5 != -1) {
                            if (j5 != j4) {
                                fnbVar.c(new IllegalArgumentException(String.format(Locale.getDefault(), "Read upload data length %d exceeds expected length %d", Long.valueOf(fnbVar.g), Long.valueOf(fnbVar.f))));
                                break;
                            } else {
                                if (nnbVar2.k != null && nnbVar2.j.compareAndSet(false, true)) {
                                    nnbVar2.k.close();
                                }
                                pnb pnbVar2 = nnbVar2.m;
                                pnbVar2.l = 13;
                                pnbVar2.c("fireGetHeaders", new gnb(pnbVar2, new hnb(pnbVar2, (byte) 0), (byte) 2));
                                break;
                            }
                        } else if (z2) {
                            if (nnbVar2.k != null && nnbVar2.j.compareAndSet(false, true)) {
                                nnbVar2.k.close();
                            }
                            pnb pnbVar3 = nnbVar2.m;
                            pnbVar3.l = 13;
                            pnbVar3.c("fireGetHeaders", new gnb(pnbVar3, new hnb(pnbVar3, (byte) 0), (byte) 2));
                            break;
                        }
                    }
                    fnbVar.e.clear();
                    fnbVar.a.set(0);
                    fnbVar.b(new cnb(fnbVar, b2), "readFromProvider");
                    break;
                }
                break;
        }
    }

    public final void run(long j) {
        byte[] bArr = (byte[]) this.c;
        UUID uuid = MediaDrmBridge.n;
        N.MulYy5b7(j, bArr, this.b ? 1 : 0);
    }

    @Override // defpackage.vlf
    public final void u(OperaListItem operaListItem, boolean z) {
        p35 p35Var = (p35) this.c;
        if (this.b) {
            p35Var.H0();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = p35Var.r;
        int size = arrayList2.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            o35 o35Var = (o35) obj;
            if (o35Var.b.isChecked()) {
                i++;
                arrayList.add(o35Var.a);
            }
        }
        ac1 ac1Var = p35Var.w;
        ac1Var.b = i;
        ac1Var.k();
        p35Var.v.Y("exit_clear_data_categories", z4o.r((r25[]) arrayList.toArray(new r25[0])));
        p35Var.G0();
    }
}
