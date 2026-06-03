# Account Management Service

Customer-facing self-service account management and agent portal tooling. Python/Flask with event-driven integrations. Powers agentic account updates, dispute resolution, and frontline support workflows.

## Running Locally
```bash
python -m venv venv && source venv/bin/activate
pip install -r requirements.txt
export FLASK_APP=src/app.py
flask run --port=5002
```