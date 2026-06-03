# Credit Decisioning API

ML-powered underwriting and pricing service that drives consumer credit decisions across all Affirm products. Built with Python/Flask, integrates with Snowflake for analytics and AWS SageMaker for model inference. Handles 10K+ RPS at peak.

## Running Locally
```bash
python -m venv venv && source venv/bin/activate
pip install -r requirements.txt
python src/main.py
```