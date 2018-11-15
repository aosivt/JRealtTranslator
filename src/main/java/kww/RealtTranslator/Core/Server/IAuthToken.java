package kww.RealtTranslator.Core.Server;

public interface IAuthToken<T> {
    public String getUsername();

//    /// <summary>
//    /// Returns authentication data, e.g. password or some hash.
//    /// </summary>
//    /// <returns></returns>
    public T getCredentials();
//
//    void ApplyToRequest(WebRequest request);
}
