# Steps to deploy
1) Apply kuber-manifests/namespace/kolybelkin-ns.yaml to create the namespace
2) Apply other manifests from kuber-manifests
3) Use <code> curl 172.16.146.3/hello -H "Host: arch.homework"</code> or <code> curl 172.16.146.3/health -H "Host: arch.homework"</code> for testing