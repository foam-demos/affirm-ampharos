import foam
from os import getenv

foam.init(
    service_name="loan-lifecycle-service",
    api_key=getenv("FOAM_API_KEY"),
    is_production=getenv("ENV") == "production",
    enable_traces=True,
    enable_metrics=True,
    enable_logs=True
)