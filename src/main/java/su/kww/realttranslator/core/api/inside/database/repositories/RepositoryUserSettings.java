package su.kww.realttranslator.core.api.inside.database.repositories;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import su.kww.realttranslator.core.api.inside.database.entities.Site;
import su.kww.realttranslator.core.api.inside.database.entities.UserSettings;
import su.kww.realttranslator.core.api.remote.domstor.entities.login.LoginEntity;
import su.kww.realttranslator.core.api.remote.domstor.entities.resources.Resource;

public class RepositoryUserSettings extends AbstractRepository {



    public static UserSettings create(LoginEntity loginEntity){
        UserSettings userSettings = new UserSettings();
        userSettings.setKey("user_config");
        userSettings.setJson(toJson(loginEntity));
        return userSettings;
    }

    public static UserSettings getExistUserSettings(){
        return (UserSettings) select(UserSettings.class.getName()).stream().findFirst().orElse(new UserSettings());
    }



}
