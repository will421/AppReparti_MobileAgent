package jus.aor.mobilagent.kernel;

import java.net.URI;
import java.net.URISyntaxException;

import jus.aor.mobilagent.kernel.BAMAgentClassLoader;

public class Agent implements _Agent {

	private Route route;
	private String serverName;
	

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

	@Override
	public void addEtape(Etape etape) {
		// TODO Auto-generated method stub

	}

	@Override
	public void init(AgentServer agentServer, String serverName) {
		this.serverName = serverName;
		try {
			route = new Route(new Etape(new URI(serverName),_Action.NIHIL));
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void init(BAMAgentClassLoader loader, AgentServer server,
			String serverName) {
		// TODO Auto-generated method stub
		
	}

	protected _Action retour() {
		return _Action.NIHIL;
	}

}
