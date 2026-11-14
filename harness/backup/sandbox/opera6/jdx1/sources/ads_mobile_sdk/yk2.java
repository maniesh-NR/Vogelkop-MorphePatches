package ads_mobile_sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.common.util.Hex;
import defpackage.kap;
import java.io.File;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class yk2 {
    public final File a;
    public final File b;
    public final SharedPreferences c;
    public final kap d;
    public final th3 e;

    public yk2(Context context, SharedPreferences sharedPreferences, kap kapVar, th3 th3Var) {
        this.c = sharedPreferences;
        File dir = context.getDir("pccache2", 0);
        ddh.g(dir, false);
        this.a = dir;
        File dir2 = context.getDir("tmppccache2", 0);
        ddh.g(dir2, true);
        this.b = dir2;
        this.d = kapVar;
        this.e = th3Var;
    }

    public final jl2 a(int i) {
        String string;
        kap kapVar = this.d;
        SharedPreferences sharedPreferences = this.c;
        if (i == 1) {
            string = sharedPreferences.getString("LATMTD" + ((int) ((mk) kapVar.get()).a), null);
        } else if (i == 2) {
            string = sharedPreferences.getString("FBAMTD" + ((int) ((mk) kapVar.get()).a), null);
        } else {
            string = null;
        }
        if (!TextUtils.isEmpty(string)) {
            try {
                byte[] bArrStringToBytes = Hex.stringToBytes(string);
                fr frVar = hr.b;
                jl2 jl2VarA = jl2.a(hr.a(0, bArrStringToBytes.length, bArrStringToBytes));
                if (a(jl2VarA.r().r())) {
                    return jl2VarA;
                }
            } catch (bj1 unused) {
                this.e.b(fl0.EVENT_ID_DG_STORAGE_PROGRAM_CACHE_PARSE_METADATA_EXCEPTION);
                return null;
            }
        }
        return null;
    }

    public final File a() {
        File file = new File(this.a, Integer.toString(((mk) this.d.get()).a));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    public final void a(jl2 jl2Var, byte[] bArr, byte[] bArr2) {
        File file;
        File file2;
        String strR = jl2Var.r().r();
        boolean zIsEmpty = TextUtils.isEmpty(strR);
        th3 th3Var = this.e;
        if (!zIsEmpty && bArr2.length != 0) {
            File file3 = this.b;
            ddh.k(file3);
            file3.mkdirs();
            if (TextUtils.isEmpty(strR)) {
                file = null;
            } else {
                file = new File(file3, strR);
                ddh.g(file, false);
            }
            file.getClass();
            file.mkdirs();
            File fileC = ddh.c(file3, strR, "pcam.jar");
            fileC.getClass();
            if (bArr == null || bArr.length <= 0 || ddh.l(fileC, bArr)) {
                File fileC2 = ddh.c(file3, strR, "pcbc");
                fileC2.getClass();
                if (ddh.l(fileC2, bArr2)) {
                    String strR2 = jl2Var.r().r();
                    if (!TextUtils.isEmpty(strR2)) {
                        File fileC3 = ddh.c(file3, strR2, "pcam.jar");
                        fileC3.getClass();
                        File fileC4 = ddh.c(file3, strR2, "pcbc");
                        fileC4.getClass();
                        File fileC5 = ddh.c(a(), strR2, "pcam.jar");
                        fileC5.getClass();
                        File fileC6 = ddh.c(a(), strR2, "pcbc");
                        fileC6.getClass();
                        if (fileC3.exists() && !fileC3.renameTo(fileC5)) {
                            th3Var.b(fl0.EVENT_ID_DG_STORAGE_PROGRAM_CACHE_VM_RENAME_FAILED);
                        } else if (fileC4.exists() && fileC4.renameTo(fileC6)) {
                            jl2 jl2VarA = a(1);
                            SharedPreferences.Editor editorEdit = this.c.edit();
                            kap kapVar = this.d;
                            if (jl2VarA != null && !jl2Var.r().r().equals(jl2VarA.r().r())) {
                                editorEdit.putString("FBAMTD" + ((int) ((mk) kapVar.get()).a), Hex.bytesToStringLowercase(jl2VarA.a()));
                            }
                            editorEdit.putString("LATMTD" + ((int) ((mk) kapVar.get()).a), Hex.bytesToStringLowercase(jl2Var.a()));
                            if (!editorEdit.commit()) {
                                th3Var.b(fl0.EVENT_ID_DG_STORAGE_PROGRAM_CACHE_PUSH_METADATA_FAILURE);
                            }
                        } else {
                            th3Var.b(fl0.EVENT_ID_DG_STORAGE_PROGRAM_CACHE_PROGRAM_BYTECODE_RENAME_FAILED);
                        }
                    }
                    HashSet hashSet = new HashSet();
                    jl2 jl2VarA2 = a(1);
                    if (jl2VarA2 != null) {
                        hashSet.add(jl2VarA2.r().r());
                    }
                    jl2 jl2VarA3 = a(2);
                    if (jl2VarA3 != null) {
                        hashSet.add(jl2VarA3.r().r());
                    }
                    File[] fileArrListFiles = a().listFiles();
                    if (fileArrListFiles != null) {
                        for (File file4 : fileArrListFiles) {
                            String name = file4.getName();
                            if (!hashSet.contains(name)) {
                                File fileA = a();
                                if (TextUtils.isEmpty(name)) {
                                    file2 = null;
                                } else {
                                    file2 = new File(fileA, name);
                                    ddh.g(file2, false);
                                }
                                file2.getClass();
                                ddh.k(file2);
                            }
                        }
                        return;
                    }
                    return;
                }
            }
        }
        th3Var.b(fl0.EVENT_ID_DG_STORAGE_PROGRAM_CACHE_SAVE_TEMP_PROGRAM_FAILURE);
    }

    public final boolean a(String str) {
        File fileC = ddh.c(a(), str, "pcam.jar");
        fileC.getClass();
        if (!fileC.exists()) {
            fileC = ddh.c(a(), str, "pcam");
            fileC.getClass();
        }
        File fileC2 = ddh.c(a(), str, "pcbc");
        fileC2.getClass();
        return fileC.exists() && fileC2.exists();
    }
}
