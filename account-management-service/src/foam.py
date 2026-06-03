import foam
from config import get_foam_config

config = get_foam_config()
foam.init(
    service_name="account-management-service",
    api_key=config.foam_api_key,
    is_production=config.is_production,
    enable_traces=True,
    enable_metrics=True
)