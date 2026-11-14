package com.opera.android.backup;

import android.app.backup.BackupAgent;
import android.app.backup.BackupDataInput;
import android.app.backup.BackupDataOutput;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.UriMatcher;
import android.os.ParcelFileDescriptor;
import com.opera.android.settings.UserSettingsContentProvider;
import defpackage.c37;
import defpackage.i0i;
import defpackage.nx1;
import defpackage.ru9;
import defpackage.t28;
import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public class OperaBackupAgent extends BackupAgent {
    public t28 a;

    @Override // android.app.backup.BackupAgent
    public final void onBackup(ParcelFileDescriptor parcelFileDescriptor, BackupDataOutput backupDataOutput, ParcelFileDescriptor parcelFileDescriptor2) {
    }

    @Override // android.app.backup.BackupAgent
    public final void onCreate() {
        nx1 nx1Var = i0i.a;
        this.a = (t28) i0i.b.d(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0035  */
    @Override // android.app.backup.BackupAgent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onFullBackup(android.app.backup.FullBackupDataOutput r8) throws java.lang.Throwable {
        /*
            r7 = this;
            super.onFullBackup(r8)
            t28 r0 = r7.a
            android.content.Context r1 = r0.a
            java.lang.String r2 = "enc_bkgmgr"
            r3 = 0
            android.content.SharedPreferences r2 = r1.getSharedPreferences(r2, r3)
            nx1 r4 = defpackage.i0i.a
            java.lang.String r4 = "k2"
            r5 = 0
            java.lang.String r2 = r2.getString(r4, r5)
            if (r2 == 0) goto L35
            byte[] r2 = android.util.Base64.decode(r2, r3)     // Catch: java.lang.IllegalArgumentException -> L35
            nx1 r4 = defpackage.i0i.a     // Catch: java.lang.IllegalArgumentException -> L35
            java.lang.Object r1 = r4.d(r1)     // Catch: java.lang.IllegalArgumentException -> L35
            c36 r1 = (defpackage.c36) r1     // Catch: java.lang.IllegalArgumentException -> L35
            byte[] r1 = r1.b(r2)     // Catch: java.lang.IllegalArgumentException -> L35
            if (r1 == 0) goto L35
            int[] r2 = defpackage.o36.a     // Catch: java.lang.IllegalArgumentException -> L35
            javax.crypto.spec.SecretKeySpec r2 = new javax.crypto.spec.SecretKeySpec     // Catch: java.lang.IllegalArgumentException -> L35
            java.lang.String r4 = "AES"
            r2.<init>(r1, r4)     // Catch: java.lang.IllegalArgumentException -> L35
            goto L36
        L35:
            r2 = r5
        L36:
            if (r2 == 0) goto L91
            java.lang.Class r1 = r8.getClass()     // Catch: java.lang.Throwable -> L49
            java.lang.String r4 = "getData"
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r4, r5)     // Catch: java.lang.Throwable -> L49
            java.lang.Object r1 = r1.invoke(r8, r5)     // Catch: java.lang.Throwable -> L49
            if (r1 != 0) goto L49
            r3 = 1
        L49:
            java.io.File r1 = new java.io.File
            android.content.Context r4 = r0.a
            java.io.File r4 = r4.getFilesDir()
            java.lang.String r6 = ".prot.tmp"
            r1.<init>(r4, r6)
            if (r3 != 0) goto L65
            boolean r4 = r1.exists()
            if (r4 == 0) goto L65
            r7.fullBackupFile(r1, r8)
            r1.delete()
            goto L91
        L65:
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L89 java.io.IOException -> L8e
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L89 java.io.IOException -> L8e
            javax.crypto.CipherOutputStream r2 = defpackage.o36.b(r4, r2)     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L87
            umi r4 = r0.b     // Catch: java.lang.Throwable -> L7f java.io.IOException -> L82
            r0.a(r2, r4)     // Catch: java.lang.Throwable -> L7f java.io.IOException -> L82
            r2.close()     // Catch: java.lang.Throwable -> L7f java.io.IOException -> L82
            r7.fullBackupFile(r1, r8)     // Catch: java.lang.Throwable -> L89 java.io.IOException -> L8e
            if (r3 != 0) goto L91
            r1.delete()     // Catch: java.lang.Throwable -> L89 java.io.IOException -> L8e
            goto L91
        L7f:
            r7 = move-exception
            r5 = r2
            goto L8a
        L82:
            r5 = r2
            goto L8e
        L84:
            r7 = move-exception
            r5 = r4
            goto L8a
        L87:
            r5 = r4
            goto L8e
        L89:
            r7 = move-exception
        L8a:
            xvg.l(r5)
            throw r7
        L8e:
            xvg.l(r5)
        L91:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.opera.android.backup.OperaBackupAgent.onFullBackup(android.app.backup.FullBackupDataOutput):void");
    }

    @Override // android.app.backup.BackupAgent
    public final void onRestore(BackupDataInput backupDataInput, int i, ParcelFileDescriptor parcelFileDescriptor) {
    }

    @Override // android.app.backup.BackupAgent
    public final void onRestoreFile(ParcelFileDescriptor parcelFileDescriptor, long j, File file, int i, long j2, long j3) throws IOException {
        super.onRestoreFile(parcelFileDescriptor, j, file, i, j2, j3);
        t28 t28Var = this.a;
        t28Var.getClass();
        Context context = t28Var.a;
        try {
            if (new File(context.getFilesDir(), ".prot.tmp").getCanonicalFile().equals(file.getCanonicalFile())) {
                file.renameTo(new File(context.getFilesDir(), ".prot.pending.tmp"));
            }
        } catch (IOException unused) {
        }
    }

    @Override // android.app.backup.BackupAgent
    public final void onRestoreFinished() throws Throwable {
        getSharedPreferences("onboarding_after_restore", 0).edit().putBoolean("need", true).apply();
        nv6 nv6VarB = ru9.c(this).b();
        SharedPreferences.Editor editor = (SharedPreferences.Editor) nv6VarB.a;
        editor.remove("crypto.wallet.has_wallet");
        editor.remove("crypto.wallet.new_wallet_migration");
        editor.remove("crypto.wallet.has_new_wallet");
        editor.putBoolean("crypto.wallet.new_wallet_reset", true);
        editor.remove("onboarding.id");
        editor.remove("vpn_pro.kill_switch.on");
        editor.remove("internal.override_ab_group");
        nv6VarB.w();
        oup.Z(this).edit().remove("channels_version_key").remove("persistent.installTime").apply();
        File dir = getDir("opera", 0);
        c37 c37Var = new c37("prefs.json", (byte) 1);
        c37Var.z("opera.oauth2.last_device_name");
        c37Var.z("opera.oauth2.session");
        c37Var.z("opera.oauth2.last_session_info");
        c37Var.z("opera.oauth2.sandbox.aria.session");
        c37Var.z("opera.oauth2.sandbox.aria.last_session_info");
        c37Var.z("sync");
        c37Var.z("opera.account_push.device_ids");
        c37Var.c(dir);
        c37 c37Var2 = new c37("favorites.json", (byte) 1);
        ((LinkedHashMap) c37Var2.a).put("app_restored_from_backup", Boolean.TRUE);
        c37Var2.c(getFilesDir());
        UriMatcher uriMatcher = UserSettingsContentProvider.f;
        getSharedPreferences("user_settings", 0).edit().remove("downloads_location").remove("offline_pages_location").apply();
        getSharedPreferences("appboy-manager", 0).edit().remove("huid").remove("user_id").remove("ab_group").remove("last_launch").remove("ad_set").apply();
        getSharedPreferences("pushed-content-versions", 0).edit().remove("version").commit();
    }
}
