import foam
from config import FOAM_API_KEY, IS_PRODUCTION

foam.init(
    service_name="credit-decisioning-api",
    api_key=FOAM_API_KEY,
    is_production=IS_PRODUCTION,
    enable_traces=True,
    enable_metrics=True
)