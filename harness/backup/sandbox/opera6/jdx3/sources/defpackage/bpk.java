package defpackage;

import android.database.Cursor;
import android.database.SQLException;
import com.leanplum.utils.SizeUtil;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class bpk extends ryd {
    public final /* synthetic */ byte c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bpk(int i, int i2, byte b) {
        super(i, i2);
        this.c = b;
    }

    public static String b(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        orb.u(jSONObject.remove("topOffset"));
        orb.u(jSONObject.remove("bottomOffset"));
        try {
            jSONObject.put("topOffsetRatio", 0.0d);
            return jSONObject.toString();
        } catch (JSONException e) {
            t3p.n(e);
            return null;
        }
    }

    public final void a(to9 to9Var) throws IllegalArgumentException {
        switch (this.c) {
            case 0:
                to9Var.n("CREATE TABLE IF NOT EXISTS `provider_info` (`type` INTEGER NOT NULL, `score` REAL NOT NULL, PRIMARY KEY(`type`))");
                return;
            case 1:
                to9Var.n("CREATE TABLE IF NOT EXISTS `partner_data` (`id` INTEGER NOT NULL, `url` TEXT NOT NULL, `final_domain` TEXT NOT NULL, `title` TEXT NOT NULL, `score` REAL NOT NULL, `icon_url` TEXT NOT NULL, `received` INTEGER NOT NULL, `keep_until` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                return;
            case 2:
                to9Var.n("CREATE TABLE IF NOT EXISTS `partner_tree` (`received` INTEGER NOT NULL, `keep_until` INTEGER NOT NULL, `tree` BLOB NOT NULL, PRIMARY KEY(`received`))");
                return;
            case 3:
                to9Var.n("CREATE TABLE IF NOT EXISTS `domain_data` (`domain` TEXT NOT NULL, `rating` INTEGER NOT NULL, `last_updated` INTEGER NOT NULL, PRIMARY KEY(`domain`))");
                return;
            case 4:
                to9Var.n("ALTER TABLE `partner_data` ADD COLUMN`global_score` REAL NOT NULL DEFAULT 0.0");
                return;
            case 5:
                to9Var.n("ALTER TABLE `partner_data` ADD COLUMN `autocomplete_chars` INT NOT NULL DEFAULT 2");
                to9Var.n("ALTER TABLE `partner_data` ADD COLUMN `recommend_chars` INT NOT NULL DEFAULT 2");
                return;
            case 6:
                Cursor cursorR = to9Var.r("SELECT * FROM entry");
                int columnIndexOrThrow = cursorR.getColumnIndexOrThrow("tabId");
                int columnIndexOrThrow2 = cursorR.getColumnIndexOrThrow("descriptionMedium");
                int columnIndexOrThrow3 = cursorR.getColumnIndexOrThrow("descriptionMini");
                while (cursorR.moveToNext()) {
                    int i = cursorR.getInt(columnIndexOrThrow);
                    to9Var.o("UPDATE Entry SET descriptionMedium=? WHERE tabId=?", new Object[]{b(cursorR.getString(columnIndexOrThrow2)), Integer.valueOf(i)});
                    to9Var.o("UPDATE Entry SET descriptionMini=? WHERE tabId=?", new Object[]{b(cursorR.getString(columnIndexOrThrow3)), Integer.valueOf(i)});
                }
                return;
            case 7:
                to9Var.n("CREATE TABLE IF NOT EXISTS `transactions` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `hash` TEXT NOT NULL, `log_index` INTEGER NOT NULL, `account_id` INTEGER NOT NULL, `from` TEXT NOT NULL, `to` TEXT NOT NULL, `type` INTEGER NOT NULL, `contract` TEXT NOT NULL, `value` TEXT NOT NULL, `time` INTEGER NOT NULL, `block` INTEGER NOT NULL, `status` INTEGER NOT NULL, FOREIGN KEY(`account_id`) REFERENCES `accounts`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                to9Var.n("CREATE  INDEX `index_transactions_account_id` ON `transactions` (`account_id`)");
                to9Var.n("CREATE TABLE IF NOT EXISTS `tokens_info` (`net` INTEGER NOT NULL, `updated` INTEGER NOT NULL, `contract` TEXT NOT NULL, `name` TEXT NOT NULL, `symbol` TEXT NOT NULL, `decimals` INTEGER NOT NULL, `type` INTEGER NOT NULL, `transfer_method` TEXT NOT NULL, PRIMARY KEY(`net`, `contract`))");
                return;
            case 8:
                to9Var.n("CREATE TABLE IF NOT EXISTS `favorites` (`name` TEXT NOT NULL, `address` TEXT NOT NULL, PRIMARY KEY(`address`))");
                return;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                j7c.r(to9Var, "CREATE TABLE IF NOT EXISTS wallets_tmp (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `secret` BLOB NOT NULL, `imported` INTEGER NOT NULL, `passphrase_ack` INTEGER NOT NULL, `ext_id` TEXT)", "INSERT INTO wallets_tmp SELECT id, secret, imported, passphrase_ack, ext_id FROM wallets", "DROP TABLE wallets", "CREATE TABLE IF NOT EXISTS wallets (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `secret` BLOB NOT NULL, `imported` INTEGER NOT NULL, `passphrase_ack` INTEGER NOT NULL, `ext_id` TEXT)");
                j7c.r(to9Var, "INSERT INTO wallets SELECT id, secret, imported, passphrase_ack, ext_id FROM wallets_tmp", "DROP TABLE wallets_tmp", "ALTER TABLE accounts ADD COLUMN coin_type INTEGER NOT NULL DEFAULT 60", "CREATE TABLE IF NOT EXISTS accounts_tmp (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `wallet_id` INTEGER NOT NULL, `coin_type` INTEGER NOT NULL, `data` TEXT NOT NULL, `amount` TEXT NOT NULL, `updated` INTEGER NOT NULL, `used` INTEGER NOT NULL, FOREIGN KEY(`wallet_id`) REFERENCES `wallets`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                j7c.r(to9Var, "INSERT INTO accounts_tmp SELECT id, wallet_id, coin_type, address, amount, updated, used FROM accounts", "DROP TABLE accounts", "CREATE TABLE IF NOT EXISTS accounts (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `wallet_id` INTEGER NOT NULL, `coin_type` INTEGER NOT NULL, `data` TEXT NOT NULL, `amount` TEXT NOT NULL, `updated` INTEGER NOT NULL, `used` INTEGER NOT NULL, FOREIGN KEY(`wallet_id`) REFERENCES `wallets`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )", "INSERT INTO accounts SELECT id, wallet_id, coin_type, data, amount, updated, used FROM accounts_tmp");
                to9Var.n("DROP TABLE accounts_tmp");
                to9Var.n("CREATE  INDEX `index_accounts_wallet_id` ON accounts (`wallet_id`)");
                return;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                to9Var.n("alter table accounts add column unconfirmed text not null default '0'");
                to9Var.n("alter table favorites add column coin_type integer not null default 60");
                to9Var.n("CREATE UNIQUE INDEX `index_accounts_wallet_id_coin_type` ON `accounts` (`wallet_id`, `coin_type`)");
                return;
            case 11:
                j7c.r(to9Var, "DROP TABLE tokens_info", "DROP TABLE tokens", "CREATE TABLE IF NOT EXISTS tokens (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `account_id` INTEGER NOT NULL, `updated` INTEGER NOT NULL, `amount` TEXT NOT NULL, `identifier` TEXT NOT NULL, `name` TEXT NOT NULL, `symbol` TEXT NOT NULL, `decimals` INTEGER NOT NULL, `type` INTEGER NOT NULL, `transfer_method` TEXT NOT NULL, FOREIGN KEY(`account_id`) REFERENCES `accounts`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )", "CREATE TABLE IF NOT EXISTS tokens_info (`net` INTEGER NOT NULL, `updated` INTEGER NOT NULL, `coin_type` INTEGER NOT NULL, `identifier` TEXT NOT NULL, `name` TEXT NOT NULL, `symbol` TEXT NOT NULL, `decimals` INTEGER NOT NULL, `type` INTEGER NOT NULL, `transfer_method` TEXT NOT NULL, PRIMARY KEY(`net`, `identifier`, `coin_type`))");
                to9Var.n("CREATE  INDEX `index_tokens_account_id` ON tokens (`account_id`)");
                return;
            case 12:
                to9Var.n("DROP TABLE transactions");
                to9Var.n("CREATE TABLE IF NOT EXISTS transactions (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `hash` TEXT NOT NULL, `log_index` INTEGER NOT NULL, `account_id` INTEGER NOT NULL, `from` TEXT NOT NULL, `to` TEXT NOT NULL, `type` INTEGER NOT NULL, `token_id` TEXT NOT NULL, `value` TEXT NOT NULL, `time` INTEGER NOT NULL, `block` INTEGER NOT NULL, `status` INTEGER NOT NULL, FOREIGN KEY(`account_id`) REFERENCES `accounts`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                to9Var.n("CREATE  INDEX `index_transactions_account_id` ON transactions (`account_id`)");
                return;
            case 13:
                to9Var.n("delete from tokens_info");
                to9Var.n("delete from tokens");
                to9Var.n("delete from transactions");
                return;
            case 14:
                to9Var.n("ALTER TABLE accounts ADD COLUMN active INTEGER NOT NULL DEFAULT '1'");
                return;
            case 15:
                to9Var.n("ALTER TABLE accounts ADD COLUMN position INTEGER NOT NULL DEFAULT '-1'");
                return;
            case 16:
                to9Var.n("ALTER TABLE transactions ADD COLUMN transaction_type TEXT NOT NULL DEFAULT 'TRANSFER'");
                to9Var.n("ALTER TABLE transactions ADD COLUMN token_to_id TEXT");
                to9Var.n("ALTER TABLE transactions ADD COLUMN token_to_type INTEGER");
                return;
            case 17:
                try {
                    to9Var.n("alter table wallets add column passphrase_ack integer not null default \"0\"");
                    return;
                } catch (SQLException unused) {
                    return;
                }
            case SizeUtil.textSize0_1 /* 18 */:
                j7c.r(to9Var, "DELETE FROM tokens", "DELETE FROM tokens_info", "ALTER TABLE tokens ADD COLUMN quantization INTEGER NOT NULL DEFAULT 1", "ALTER TABLE tokens_info ADD COLUMN quantization INTEGER NOT NULL DEFAULT 1");
                return;
            case 19:
                to9Var.n("CREATE TABLE IF NOT EXISTS deposits (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `hash` TEXT NOT NULL, `account_id` INTEGER NOT NULL, `type` INTEGER NOT NULL, `value` TEXT NOT NULL, `compensation` TEXT NOT NULL, `deposit_ts` INTEGER NOT NULL, `withdraw_ts` INTEGER NOT NULL, `status` INTEGER NOT NULL, FOREIGN KEY(`account_id`) REFERENCES `accounts`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                to9Var.n("CREATE  INDEX `index_deposits_account_id` ON deposits (`account_id`)");
                return;
            case SizeUtil.textSize0 /* 20 */:
                to9Var.n("delete from accounts where coin_type = 118 and active = 0");
                return;
            case 21:
                to9Var.n("ALTER TABLE tokens ADD COLUMN token_id TEXT NOT NULL DEFAULT ''");
                to9Var.n("ALTER TABLE tokens_info ADD COLUMN token_id TEXT NOT NULL DEFAULT ''");
                return;
            case SizeUtil.textSize1 /* 22 */:
                to9Var.n("alter table tokens add column type integer not null default \"0\"");
                return;
            case 23:
                to9Var.n("alter table collectibles add column description text not null default ''");
                return;
            case SizeUtil.textSize2 /* 24 */:
                to9Var.n("alter table wallets add column blockchain integer not null default \"" + b85.c.a + "\"");
                return;
            case 25:
                to9Var.h();
                try {
                    to9Var.n("alter table accounts rename to _accounts");
                    to9Var.n("alter table tokens rename to _tokens");
                    to9Var.n("alter table collectibles rename to _collectibles");
                    to9Var.n("CREATE TABLE IF NOT EXISTS `collectibles` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `account_id` INTEGER NOT NULL, `contract` TEXT NOT NULL, `name` TEXT NOT NULL, `updated` INTEGER NOT NULL, `token_id` TEXT NOT NULL, `icon` TEXT NOT NULL, `description` TEXT NOT NULL, FOREIGN KEY(`account_id`) REFERENCES `accounts`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                    to9Var.n("CREATE  INDEX `index_collectibles_account_id` ON `collectibles` (`account_id`)");
                    to9Var.n("CREATE TABLE IF NOT EXISTS `tokens` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `account_id` INTEGER NOT NULL, `updated` INTEGER NOT NULL, `amount` TEXT NOT NULL, `contract` TEXT NOT NULL, `name` TEXT NOT NULL, `symbol` TEXT NOT NULL, `decimals` INTEGER NOT NULL, `type` INTEGER NOT NULL, FOREIGN KEY(`account_id`) REFERENCES `accounts`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                    to9Var.n("CREATE  INDEX `index_tokens_account_id` ON `tokens` (`account_id`)");
                    to9Var.n("CREATE TABLE IF NOT EXISTS `accounts` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `wallet_id` INTEGER NOT NULL, `address` TEXT NOT NULL, `amount` TEXT NOT NULL, `updated` INTEGER NOT NULL, `used` INTEGER NOT NULL, FOREIGN KEY(`wallet_id`) REFERENCES `wallets`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                    to9Var.n("CREATE  INDEX `index_accounts_wallet_id` ON `accounts` (`wallet_id`)");
                    to9Var.n("insert into accounts     select a.* from wallets w, _accounts a                  where a.wallet_id = w.id");
                    to9Var.n("insert into tokens       select t.* from wallets w, _accounts a, _tokens t       where a.wallet_id = w.id and a.id = t.account_id");
                    to9Var.n("insert into collectibles select c.* from wallets w, _accounts a, _collectibles c where a.wallet_id = w.id and a.id = c.account_id");
                    to9Var.n("drop table _collectibles");
                    to9Var.n("drop table _tokens");
                    to9Var.n("drop table _accounts");
                    to9Var.s();
                    return;
                } finally {
                    to9Var.m();
                }
            case 26:
                to9Var.n("delete from tokens");
                return;
            case 27:
                to9Var.n("alter table collectibles add column url text not null default ''");
                return;
            case 28:
                to9Var.n("alter table wallets add column ext_id text");
                return;
            default:
                to9Var.n("alter table tokens add column transfer_method text not null default ''");
                return;
        }
    }
}
