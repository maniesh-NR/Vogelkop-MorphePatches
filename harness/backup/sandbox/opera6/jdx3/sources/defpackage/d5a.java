package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class d5a implements icp {
    public int a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    public d5a(File file, int i, ArrayList arrayList, n1p n1pVar, l5b l5bVar, String str) {
        this.c = file;
        this.a = i;
        this.d = arrayList;
        this.e = n1pVar;
        this.f = l5bVar;
        this.g = str;
        this.b = file;
    }

    public d5a(tsd tsdVar, n4l n4lVar, v8a v8aVar, pde pdeVar, Function0 function0, Function0 function02, Function1 function1, Function0 function03) {
        this.b = n4lVar;
        this.c = v8aVar;
        this.d = function0;
        this.e = function02;
        this.g = function1;
        this.f = function03;
        TextView textView = n4lVar.b;
        pc5 pc5Var = new pc5((Object) this, (byte) 24);
        dll dllVarS = q9n.s(textView);
        if (dllVarS != null) {
            u8n.b(dllVarS, textView, pc5Var);
        }
        final byte b = 1;
        a26.U(v8aVar, tsdVar, new f85(this, (byte) 1), new al7((Object) this, (byte) 17));
        a26.T(pdeVar, tsdVar, new ks6(this, (byte) 16));
        final byte b2 = 0;
        n4lVar.a.setOnClickListener(new View.OnClickListener(this) { // from class: c5a
            public final /* synthetic */ d5a b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b2;
                d5a d5aVar = this.b;
                switch (b3) {
                    case 0:
                        ((Function0) d5aVar.d).invoke();
                        break;
                    case 1:
                        ((Function1) d5aVar.g).invoke(view);
                        break;
                    case 2:
                        ((Function0) d5aVar.d).invoke();
                        break;
                    case 3:
                        ((Function0) d5aVar.f).invoke();
                        break;
                    default:
                        ((Function0) d5aVar.e).invoke();
                        break;
                }
            }
        });
        AppCompatImageView appCompatImageView = n4lVar.e;
        if (appCompatImageView != null) {
            appCompatImageView.setOnClickListener(new View.OnClickListener(this) { // from class: c5a
                public final /* synthetic */ d5a b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b3 = b;
                    d5a d5aVar = this.b;
                    switch (b3) {
                        case 0:
                            ((Function0) d5aVar.d).invoke();
                            break;
                        case 1:
                            ((Function1) d5aVar.g).invoke(view);
                            break;
                        case 2:
                            ((Function0) d5aVar.d).invoke();
                            break;
                        case 3:
                            ((Function0) d5aVar.f).invoke();
                            break;
                        default:
                            ((Function0) d5aVar.e).invoke();
                            break;
                    }
                }
            });
        }
        AppCompatImageView appCompatImageView2 = n4lVar.f;
        if (appCompatImageView2 != null) {
            final byte b3 = 2;
            appCompatImageView2.setOnClickListener(new View.OnClickListener(this) { // from class: c5a
                public final /* synthetic */ d5a b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b32 = b3;
                    d5a d5aVar = this.b;
                    switch (b32) {
                        case 0:
                            ((Function0) d5aVar.d).invoke();
                            break;
                        case 1:
                            ((Function1) d5aVar.g).invoke(view);
                            break;
                        case 2:
                            ((Function0) d5aVar.d).invoke();
                            break;
                        case 3:
                            ((Function0) d5aVar.f).invoke();
                            break;
                        default:
                            ((Function0) d5aVar.e).invoke();
                            break;
                    }
                }
            });
        }
        AppCompatImageView appCompatImageView3 = n4lVar.g;
        if (appCompatImageView3 != null) {
            final byte b4 = 3;
            appCompatImageView3.setOnClickListener(new View.OnClickListener(this) { // from class: c5a
                public final /* synthetic */ d5a b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b32 = b4;
                    d5a d5aVar = this.b;
                    switch (b32) {
                        case 0:
                            ((Function0) d5aVar.d).invoke();
                            break;
                        case 1:
                            ((Function1) d5aVar.g).invoke(view);
                            break;
                        case 2:
                            ((Function0) d5aVar.d).invoke();
                            break;
                        case 3:
                            ((Function0) d5aVar.f).invoke();
                            break;
                        default:
                            ((Function0) d5aVar.e).invoke();
                            break;
                    }
                }
            });
        }
        Iterator it = n4lVar.h.iterator();
        while (it.hasNext()) {
            final byte b5 = 4;
            ((View) it.next()).setOnClickListener(new View.OnClickListener(this) { // from class: c5a
                public final /* synthetic */ d5a b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b32 = b5;
                    d5a d5aVar = this.b;
                    switch (b32) {
                        case 0:
                            ((Function0) d5aVar.d).invoke();
                            break;
                        case 1:
                            ((Function1) d5aVar.g).invoke(view);
                            break;
                        case 2:
                            ((Function0) d5aVar.d).invoke();
                            break;
                        case 3:
                            ((Function0) d5aVar.f).invoke();
                            break;
                        default:
                            ((Function0) d5aVar.e).invoke();
                            break;
                    }
                }
            });
        }
    }

    @Override // defpackage.icp
    public final void a(int i, Object obj) {
        n1p n1pVar = (n1p) this.e;
        ArrayList arrayList = (ArrayList) this.d;
        Object obj2 = this.c;
        File file = (File) obj2;
        int i2 = this.a;
        p0i p0iVar = t0i.b;
        boolean z = obj instanceof q0i;
        if (z && i2 != arrayList.size() - 1) {
            sa7 sa7Var = l1p.a;
            int i3 = i2 + 1;
            l5b l5bVar = (l5b) this.f;
            String str = (String) arrayList.get(i3);
            dap.c(str, new cno(l5bVar, (byte) 8), new p9p(l5bVar, (byte) 10), new d5a((File) obj2, i3, arrayList, n1pVar, l5bVar, str));
            return;
        }
        Set set = l1p.b;
        set.contains(file);
        set.remove(file);
        String str2 = (String) this.g;
        if (!z) {
            obj = new kzo((z2p) obj, str2);
        }
        n1pVar.invoke(new t0i(obj));
    }

    public final void b() {
        n4l n4lVar = (n4l) this.b;
        u8a u8aVar = (u8a) ((v8a) this.c).g.get(Integer.valueOf(this.a));
        if (u8aVar != null) {
            TextView textView = n4lVar.c;
            TextView textView2 = n4lVar.d;
            if (textView != null) {
                String str = String.format(Locale.getDefault(), "%d", Arrays.copyOf(new Object[]{Integer.valueOf(u8aVar.b)}, 1));
                if (str.length() > 2) {
                    str = "…";
                }
                textView.setText(str);
            }
            textView2.setText(u8aVar.a.c().a(textView2.getResources()));
        }
        c();
    }

    public final void c() {
        u8a u8aVar = (u8a) ((v8a) this.c).g.get(Integer.valueOf(this.a));
        if (u8aVar == null) {
            return;
        }
        k4l k4lVarB = u8aVar.a.b();
        TextView textView = ((n4l) this.b).b;
        textView.setBackgroundTintList(k4lVarB.a.b(textView.getContext()));
        textView.setTextColor(k4lVarB.b.b(textView.getContext()));
    }

    public final Object s(pzh pzhVar) throws Throwable {
        z2p q0iVar;
        File file;
        FileOutputStream fileOutputStream;
        File file2 = (File) this.b;
        try {
            p0i p0iVar = t0i.b;
            file = new File(file2.getAbsolutePath() + '.' + UUID.randomUUID() + ".b2aa479c.tmp");
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            try {
                fileOutputStream = new FileOutputStream(file);
            } catch (Throwable th) {
                file.delete();
                throw th;
            }
        } catch (Throwable th2) {
            p0i p0iVar2 = t0i.b;
            q0iVar = new q0i(th2);
        }
        try {
            InputStream inputStreamByteStream = pzhVar.g.byteStream();
            byte[] bArr = new byte[8192];
            for (int i = inputStreamByteStream.read(bArr); i >= 0; i = inputStreamByteStream.read(bArr)) {
                fileOutputStream.write(bArr, 0, i);
            }
            fileOutputStream.close();
            boolean zExists = file2.exists();
            if (!file.renameTo(file2)) {
                throw new IOException("Can't rename to target file " + file2);
            }
            q0iVar = zExists ? z2p.b : z2p.a;
            z2p z2pVar = q0iVar instanceof q0i ? null : q0iVar;
            if (z2pVar != null) {
                return z2pVar;
            }
            if (file2.exists()) {
                return z2p.c;
            }
            Throwable thD = t0i.d(q0iVar);
            if (thD == null) {
                throw new IOException("Unknown error");
            }
            throw thD;
        } finally {
        }
    }
}
